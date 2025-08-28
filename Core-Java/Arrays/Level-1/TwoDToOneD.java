import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input elements for 2D array
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D to 1D
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Print 1D array
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}