import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 1: Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // extract last digit
            temp /= 10;
        }

        // Step 3: Create reverse array
        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        // Step 4: Display reversed array (i.e. reversed number)
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
        System.out.println();

        sc.close();
    }
}