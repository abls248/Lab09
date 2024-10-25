import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of 100 integers
        int[] dataPoints = new int[100];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the range for random values
        int lowerBound = SafeInput.getRangedInt(scanner, "Enter the lower bound for random values", 1, 100);
        int upperBound = SafeInput.getRangedInt(scanner, "Enter the upper bound for random values", lowerBound, 200);

        // Create a Random object
        Random rnd = new Random();

        // Fill the array with random values within the specified range
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }

        // Display the contents of the array
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.println("dataPoints[" + i + "] = " + dataPoints[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
