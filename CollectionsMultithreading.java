import java.util.ArrayList;
import java.util.List;

public class CollectionsMultithreading {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Runnable task = () -> {
            for (int num : numbers) {
                System.out.println("Thread ID: " + Thread.currentThread().getId() + ", Number: " + num);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
