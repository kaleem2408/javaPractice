public class ExceptionHandlingMultithreadingExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                int result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
