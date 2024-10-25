import java.util.Random;

public class ArrayLoop3 {

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
        System.out.println();

        // Calculate the sum of values in dataPoints
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        // Calculate the average of the values
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);
    }
}

