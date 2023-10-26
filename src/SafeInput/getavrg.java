import java.util.Random;

public class getavrg {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int userValue = getRangedInt("Enter an integer between 1 and 100: ", 1, 100);
        int count = 0;

        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }

        System.out.println("The user's value was found " + count + " times in the array.");

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        double avg = getAverage(dataPoints);
        System.out.println("Average of dataPoints is: " + avg);
    }

    public static int getRangedInt(String prompt, int min, int max) {
        int userInput;
        do {
            userInput = getInt(prompt);
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static int getInt(String prompt) {

        return 0;
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
