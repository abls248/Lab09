import java.util.Random;
import java.util.Scanner;

public class LinScan3 {

    public static void main(String[] args) {
        // Declare and initialize an array of 100 integers
        int[] dataPoints = new int[100];


        Random rnd = new Random();

        // Initialize each element in the array with a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }


        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to a new line after displaying all values
        Scanner scanner = new Scanner(System.in);
        int userValue1 = SafeInput.getRangedInt(scanner, "Please enter a value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue1);
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue1) {
                count++;
            }
        }
        // Display how many times the user's value was found
        System.out.println("The value " + userValue1 + " was found " + count + " time(s) in the dataPoints array.");

        // Prompt the user again for another value between 1 and 100
        int userValue2 = SafeInput.getRangedInt(scanner, "Please enter another value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue2);

        // Search for the second user value and display the index if found
        boolean found = false; // To track if the value was found
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                System.out.println("The value " + userValue2 + " was found at array index " + i + ".");
                found = true; // Set found to true
                break; // Exit the loop on first match
            }
        }
        // If not found, inform the user
        if (!found) {
            System.out.println("The value " + userValue2 + " was not found in the dataPoints array.");
        }
        scanner.close();
    }
}

