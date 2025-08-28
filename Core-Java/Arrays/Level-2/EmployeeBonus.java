import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] years = new double[10];

        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Take input for salary and years of service
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salary[i] = sc.nextDouble();

                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    years[i] = sc.nextDouble();

                    // Validation
                    if (salary[i] <= 0 || years[i] < 0) {
                        System.out.println("Invalid input! Please enter again.");
                        continue;
                    }
                    break; // valid input → exit loop
                } catch (Exception e) {
                    System.out.println("Invalid input! Enter numbers only.");
                    sc.next(); // clear buffer
                }
            }
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Totals ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}