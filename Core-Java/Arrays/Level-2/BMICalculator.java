import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step 3: Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();
        }

        // Step 4: Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 5: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Person", "Weight", "Height", "BMI Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-15s%n", (i + 1), weight[i], height[i], status[i]);
        }

        sc.close();
    }
}