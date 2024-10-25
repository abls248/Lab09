import java.util.Random;

public class ArrayLoop {

    public static void main(String[] args) {
        // Declare and initialize an array of 100 integers
        int[] dataPoints = new int[100];

        // Create a Random object
        Random rnd = new Random();

        // Initialize each element in the array with a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display the contents of the array
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.println("dataPoints[" + i + "] = " + dataPoints[i]);
        }
    }
}

