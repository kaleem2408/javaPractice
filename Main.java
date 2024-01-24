/*write a java program create a interface ,create a fully qualified method than 
create two abstract methods
1) abstract method should consist of array of strings --> check if duplicate or not output must be integer 
2) abstract method should consist of array of integers--> check if there duplicate remove num
create a test class */


// Define an interface
interface MyInterface {//interface
    void fullyQualifiedMethod();//fullyQualifiedMethod

    int countDuplicateStrings(String[] strArray);//abstract methods

    int[] removeDuplicateIntegers(int[] intArray);//abstract methods
}

// Create a test class to demonstrate the interface methods
class TestClass implements MyInterface {
    // Implementation of the fully qualified method
    public void fullyQualifiedMethod() {
        System.out.println("This is the fully qualified method.");
    }

    // Implementation of the method to count duplicate strings
    public int countDuplicateStrings(String[] strArray) {
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    // Implementation of the method to remove duplicate integers
    public int[] removeDuplicateIntegers(int[] intArray) {
        int[] uniqueIntegers = new int[intArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < intArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (intArray[i] == uniqueIntegers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueIntegers[uniqueCount++] = intArray[i];
            }
        }

        //Trim the array to the actual size
        int[] trimmedArray = new int[uniqueCount];
        System.arraycopy(uniqueIntegers, 0, trimmedArray, 0, uniqueCount);
        return trimmedArray; 
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of TestClass
        TestClass testObj = new TestClass();

        // Call the fully qualified method
        testObj.fullyQualifiedMethod();

        // Test for counting duplicate strings
        String[] strArray = {"apple", "banana", "cherry", "apple", "date", "banana"};
        int duplicateCount = testObj.countDuplicateStrings(strArray);
        System.out.println("Number of duplicate strings: " + duplicateCount);

        // Test for removing duplicate integers
        int[] intArray = {1, 2, 3, 2, 4, 5, 3};
        int[] uniqueIntegers = testObj.removeDuplicateIntegers(intArray);
        System.out.println("Unique integers in the array:");
        for (int num : uniqueIntegers) {
            System.out.print(num + " ");
        }
    }
}

