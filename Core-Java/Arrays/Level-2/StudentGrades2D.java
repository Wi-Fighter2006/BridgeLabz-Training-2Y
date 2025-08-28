import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array for marks [students][3 subjects]
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1 ? "Chemistry" : "Maths");
                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] >= 0) break;
                    System.out.println("Invalid! Enter positive marks.");
                }
            }

            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + marks[i][0] +
                    " | Chemistry: " + marks[i][1] +
                    " | Maths: " + marks[i][2] +
                    " | Percentage: " + String.format("%.2f", percentage[i]) +
                    "% | Grade: " + grade[i]);
        }

        sc.close();
    }
}