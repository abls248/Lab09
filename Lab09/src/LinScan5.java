import java.util.Random;
import java.util.Scanner;

public class LinScan5 {

    public static void main(String[] args) {
        // Declare and initialize an array of 100 integers
        int[] dataPoints = new int[100];

        // Create a Random object
        Random rnd = new Random();

        // Initialize each element in the array with a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display values in a single line separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to a new line after displaying all values

        // Prompt the user to enter a value between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int userValue1 = SafeInput.getRangedInt(scanner, "Please enter a value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue1);

        // Count occurrences of userValue in dataPoints
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

        // Find the minimum and maximum values in the dataPoints array
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i]; // Update minValue if current is lower
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i]; // Update maxValue if current is higher
            }
        }

        // Display the minimum and maximum values
        System.out.println("The minimum value in the dataPoints array is: " + minValue);
        System.out.println("The maximum value in the dataPoints array is: " + maxValue);

        // Calculate and display the average
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        // Close the scanner
        scanner.close();
    }

    // Static method to calculate the average of an array of integers
    public static double getAverage(int values[]) {
        double sum = 0;
        for (int value : values) {
            sum += value; // Accumulate the sum of the values
        }
        return sum / values.length; // Return the average
    }
}

