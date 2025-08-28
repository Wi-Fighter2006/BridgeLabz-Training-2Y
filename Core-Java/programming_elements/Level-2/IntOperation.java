import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take integer inputs
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Perform integer operations
        int result1 = a + b * c;      // Multiplication has higher precedence than addition
        int result2 = a * b + c;      // Multiplication before addition
        int result3 = c + a / b;      // Division before addition
        int result4 = a % b + c;      // Modulus before addition

        // Print results
        System.out.println("The results of Int Operations are " +
                           result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}