package code100days.Days_1_to_10;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        // Approach 1 - Sorting Using an Array
        int a = 4, b = 78, c = 13;

        // Store numbers in an array and sort them
        int[] numbers = {a, b, c};
        Arrays.sort(numbers); // Sorting the array in ascending order

        // The second-largest number will be at index 1 after sorting
        System.out.println("The second largest number among a, b, and c is: " + numbers[1]);

        // Approach 2 - Using Math Functions
        int d = 87, e = 99, f = 56;

        // Find the largest and smallest numbers using Math.max and Math.min
        int largest = Math.max(d, Math.max(e, f));
        int smallest = Math.min(d, Math.min(e, f));

        // Calculate the second largest by subtracting the largest and smallest from the sum
        int secondLargest = d + e + f - largest - smallest;

        System.out.println("The second largest number among d, e, and f is: " + secondLargest);
    }
}
