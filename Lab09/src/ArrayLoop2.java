import java.util.Random;

public class ArrayLoop2 {

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
            // Print each value followed by " | ", except after the last value
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to a new line after displaying all values
    }
}
