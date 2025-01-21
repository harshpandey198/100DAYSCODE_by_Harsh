package code100days.Days_11_to_20;

import java.util.Scanner;

public class RearrangeArray {

    // Method to rearrange the array with negatives at the start and zeros at the end
    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        // Step 1: Create a new array to store the result
        int[] temp = new int[n];
        int index = 0;

        // Step 2: First, move all negative numbers to the beginning
        for (int num : arr) {
            if (num < 0) {
                temp[index++] = num;  // Add negative number to the new array
            }
        }

        // Step 3: Next, move all positive numbers (greater than zero) in their relative order
        for (int num : arr) {
            if (num > 0) {
                temp[index++] = num;  // Add positive number to the new array
            }
        }

        // Step 4: Finally, move all zeros to the end
        for (int num : arr) {
            if (num == 0) {
                temp[index++] = num;  // Add zero to the new array
            }
        }

        // Step 5: Copy back the rearranged elements into the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the size of the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Call the rearrange function
        rearrangeArray(arr);

        // Step 4: Print the rearranged array
        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
