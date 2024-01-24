import java.util.ArrayList;
import java.util.List;

public class CollectionsExceptionHandling {
    public static void main(String[] args) {
        try {
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add(null); // Simulating a null element

            for (String fruit : fruits) {
                if (fruit.length() > 0) {
                    System.out.println(fruit);
                } else {
                    throw new NullPointerException("Null element found");
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
