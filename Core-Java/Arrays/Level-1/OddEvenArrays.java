import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Enter a natural number greater than 0.");
            return;
        }

        // Arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0, evenIndex = 0;

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Print Odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print Even numbers
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}