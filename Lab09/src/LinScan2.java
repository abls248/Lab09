import java.util.Random;
import java.util.Scanner;

public class LinScan2 {
    public static void main(String[] args) {
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
        int userValue = SafeInput.getRangedInt(scanner, "Please enter a value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue);
        // Calculate the sum of values in dataPoints
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        // Calculate the average of the values
        double average = (double) sum / dataPoints.length;
        // Display the sum and average with descriptive text
        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);
        // Count occurrences of userValue in dataPoints
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }

        // Display how many times the user's value was found
        System.out.println("The value " + userValue + " was found " + count + " time(s) in the dataPoints array.");

        scanner.close();
    }
}
