import java.util.Scanner;

public class DynamicDigitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;  // initial size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0) {
            int digit = number % 10;   // get last digit
            number /= 10;              // remove last digit

            // Expand array if full
            if (index == maxDigit) {
                maxDigit += 10; // increase size by 10
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i]; // copy old data
                }
                digits = temp; // assign new array
            }

            digits[index] = digit;
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}