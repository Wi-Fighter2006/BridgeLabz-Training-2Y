import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take base and height input in cm
        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert to square inches (1 in = 2.54 cm → 1 sq in = (2.54 * 2.54) sq cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Print result
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        sc.close();
    }
}