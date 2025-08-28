import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for unit price and quantity
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Print result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        sc.close();
    }
}