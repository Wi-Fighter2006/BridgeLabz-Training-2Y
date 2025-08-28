import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Frequency array for digits 0–9
        int[] freq = new int[10];

        // Handle negative input
        if (num < 0) {
            num = -num;
        }

        // If number is 0, handle separately
        if (num == 0) {
            freq[0] = 1;
        }

        // Count digit frequencies
        while (num > 0) {
            int digit = (int) (num % 10); // extract last digit
            freq[digit]++;
            num /= 10;
        }

        // Display frequencies
        System.out.println("\n--- Digit Frequencies ---");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " : " + freq[i] + " times");
            }
        }

        sc.close();
    }
}