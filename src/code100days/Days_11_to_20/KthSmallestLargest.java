package code100days.Days_11_to_20;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargest {

    // Method to find the kth smallest element
    public static int findKthSmallest(int[] array, int k) {
        Arrays.sort(array); // Sort the array in ascending order
        return array[k - 1]; // Return the kth smallest element
    }

    // Method to find the kth largest element
    public static int findKthLargest(int[] array, int k) {
        Arrays.sort(array); // Sort the array in ascending order
        return array[array.length - k]; // Return the kth largest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Input k
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        // Check if k is within valid bounds
        if (k > 0 && k <= n) {
            // Find and print the kth smallest and kth largest elements
            int kthSmallest = findKthSmallest(array, k);
            int kthLargest = findKthLargest(array, k);

            System.out.println("The " + k + "th smallest element is: " + kthSmallest);
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        } else {
            System.out.println("Invalid value of k. It should be between 1 and " + n);
        }

        sc.close();
    }
}
