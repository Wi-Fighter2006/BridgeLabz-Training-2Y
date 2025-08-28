import java.util.Scanner;

public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];  // 11 players
        double sum = 0.0;

        // Input heights
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.println("The mean height of the football team is: " + mean);

        sc.close();
    }
}