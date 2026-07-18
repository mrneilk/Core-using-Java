
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Logger;

public class OrderProcessor {

    private static final Logger LOGGER = Logger.getLogger(OrderProcessor.class.getName());

    private final Executor executor;

    public OrderProcessor() {
        this(ForkJoinPool.commonPool());
    }

    public OrderProcessor(Executor executor) {
        this.executor = executor;
    }

    public CompletableFuture<String> processOrderAsync(String orderId) {
        LOGGER.info("Received request for order: " + orderId + " on thread: " + Thread.currentThread().getName());

        // Step 1: Process Payment Asynchronously
        CompletableFuture<Boolean> paymentTask = CompletableFuture.supplyAsync(() -> {
            LOGGER.info("Processing payment for " + orderId + " on thread: " + Thread.currentThread().getName());
            simulateLongRunningTask(2000); // Simulating 2-second network latency
            return true; 
        }, executor);

        // Step 2: Generate Invoice Asynchronously (runs in parallel to payment)
        CompletableFuture<String> invoiceTask = CompletableFuture.supplyAsync(() -> {
            LOGGER.info("Generating invoice for " + orderId + " on thread: " + Thread.currentThread().getName());
            simulateLongRunningTask(1500); // Simulating 1.5-second IO operations
            return "INV-" + orderId;
        }, executor);

        // Step 3: Combine both tasks when they complete
        return paymentTask.thenCombineAsync(invoiceTask, (paymentSuccess, invoiceId) -> {
            LOGGER.info("Combining results on thread: " + Thread.currentThread().getName());
            if (paymentSuccess) {
                return "Order " + orderId + " processed successfully with Invoice: " + invoiceId;
            } else {
                return "Order " + orderId + " failed due to payment issues.";
            }
        }, executor);
    }

    private void simulateLongRunningTask(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Task interrupted", e);
        }
    }
}

//from Gemini Flash