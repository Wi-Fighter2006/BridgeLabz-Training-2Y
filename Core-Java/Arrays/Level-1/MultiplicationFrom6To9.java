import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results (6 to 9 => 4 results only, but we can use 10 for flexibility)
        int[] multiplicationResult = new int[10];

        // Calculate multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i] = number * i;
        }

        // Display results
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}