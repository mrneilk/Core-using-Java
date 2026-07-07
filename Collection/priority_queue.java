import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priorityRank;

    public Task(String name, int priorityRank) {
        this.name = name;
        this.priorityRank = priorityRank;
    }

    @Override
    public String toString() {
        return name + " (Rank: " + priorityRank + ")";
    }
}

public class priority_queue {
    public static void main(String[] args) {
        // Define priority: lowest rank number gets processed first
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
            Comparator.comparingInt(task -> task.priorityRank)
        );

        taskQueue.offer(new Task("Code Review", 2));
        taskQueue.offer(new Task("Fix Production Crash", 1));
        taskQueue.offer(new Task("Update Documentation", 3));

        // Processing based on priority
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.poll());
        }
        /* Output:
           Processing: Fix Production Crash (Rank: 1)
           Processing: Code Review (Rank: 2)
           Processing: Update Documentation (Rank: 3)
        */
    }
}
