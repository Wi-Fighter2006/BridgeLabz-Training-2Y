import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];  // Array of 5 numbers

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Checking each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative");
            } else {
                System.out.println("Number " + num + " is Zero");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("Comparison between first (" + first + ") and last (" + last + "): ");
        if (first == last) {
            System.out.println("They are Equal");
        } else if (first > last) {
            System.out.println("First is Greater than Last");
        } else {
            System.out.println("First is Less than Last");
        }

        sc.close();
    }
}