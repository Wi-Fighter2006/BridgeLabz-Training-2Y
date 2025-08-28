import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            return;
        }

        // Create String array to hold results
        String[] results = new String[number + 1];

        // Loop from 0 to number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}