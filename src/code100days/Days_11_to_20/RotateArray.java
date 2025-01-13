package code100days.Days_11_to_20;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    // Method to rotate the array by K positions
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;

        // Handle cases where K is greater than array length
        k = k % n;

        // Step 1: Reverse the entire array
        reverseArray(arr, 0, n - 1);

        // Step 2: Reverse the first K elements
        reverseArray(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
       reverseArray(arr, k, n - 1);

    }

    // Helper method to reverse a portion of the array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start]; // 1 at first iteration \\ 2
            arr[start] = arr[end]; // array becomes , 5,4,3,2,5   \\
            arr[end] = temp; // array becomes , 5,4,3,2,1

            // Move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number of positions to rotate
        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();

        // Rotate the array
        rotateArray(arr, k);

        // Output the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(arr));

        sc.close();
    }
}
