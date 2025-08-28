import java.util.Scanner;

public class CourseDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100.0;
        double discountedPrice = fee - discount;

        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount (" + discountPercent + "%): INR " + discount);
        System.out.println("Discounted Price: INR " + discountedPrice);
    }
}