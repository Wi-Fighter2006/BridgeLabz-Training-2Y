import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.print("Enter age of " + names[i] + ": ");
                    ages[i] = sc.nextInt();

                    System.out.print("Enter height of " + names[i] + " (in cm): ");
                    heights[i] = sc.nextDouble();

                    if (ages[i] <= 0 || heights[i] <= 0) {
                        System.out.println("Invalid input! Please enter again.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input! Enter numbers only.");
                    sc.next();
                }
            }
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}