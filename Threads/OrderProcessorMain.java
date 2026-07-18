public class OrderProcessorMain {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        processor.processOrderAsync("1001")
                .thenAccept(result -> System.out.println(result))
                .join();
    }
}
