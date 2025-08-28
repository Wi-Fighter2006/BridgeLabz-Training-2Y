import java.util.Scanner;

public class NumberArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // Array of size 10
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        while (true) {
            double num = sc.nextDouble();

            // Stop if user enters 0 or negative
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == numbers.length) {
                System.out.println("Array is full (10 elements).");
                break;
            }

            // Store in array and increase index
            numbers[index] = num;
            index++;
        }

        // Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display sum
        System.out.println("\nSum of numbers = " + total);

        sc.close();
    }
}