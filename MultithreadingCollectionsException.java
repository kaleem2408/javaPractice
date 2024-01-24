import java.util.ArrayList;
import java.util.List;

public class MultithreadingCollectionsException {
    public static void main(String[] args) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("World");
        messages.add("");

        Runnable task = () -> {
            try {
                for (String message : messages) {
                    if (message.length() > 0) {
                        System.out.println(message);
                    } else {
                        throw new IllegalArgumentException("Empty message found");
                    }
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
