public class CourseDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        double discount = (fee * discountPercent) / 100.0;
        double discountedPrice = fee - discount;

        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount (" + discountPercent + "%): INR " + discount);
        System.out.println("Discounted Price: INR " + discountedPrice);
    }
}