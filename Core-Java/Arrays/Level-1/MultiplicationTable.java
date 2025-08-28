import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number for multiplication table: ");
        int number = sc.nextInt();

        // Array to store multiplication results (1 to 10)
        int[] table = new int[10];

        // Fill the array with results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display the results
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}