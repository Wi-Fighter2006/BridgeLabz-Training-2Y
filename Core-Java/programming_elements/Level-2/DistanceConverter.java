import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take distance input in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3.0;

        // 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760.0;

        // Print result
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}