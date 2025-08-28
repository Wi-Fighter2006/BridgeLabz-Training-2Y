import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take perimeter input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Side of the square = perimeter / 4
        double side = perimeter / 4.0;

        // Print result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}