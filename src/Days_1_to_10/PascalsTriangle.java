package Days_1_to_10;

import java.util.Scanner;

public class PascalsTriangle {

    // Method to generate and print Pascal's Triangle
    public static void generatePascalsTriangle(int rows) {
        int[][] triangle = new int[rows][rows]; // 2D array to store the triangle

        for (int i = 0; i < rows; i++) {
            // Add spaces to center the triangle
            for (int spaces = 0; spaces < rows - i - 1; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                // First or last element in a row is always 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Other elements are the sum of the two elements above them
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }

                // Print the current element with a space
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int rows = sc.nextInt();

        // Generate Pascal's Triangle
        generatePascalsTriangle(rows);

        sc.close();
    }
}
