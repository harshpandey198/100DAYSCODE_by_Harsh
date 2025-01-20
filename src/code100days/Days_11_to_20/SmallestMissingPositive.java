package code100days.Days_11_to_20;
import java.util.Scanner;

public class SmallestMissingPositive {

    // Function to find the smallest missing positive integer
    public static int findSmallestMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Create a boolean array to mark presence of numbers from 1 to n
        boolean[] present = new boolean[n + 1];

        // Step 2: Mark the numbers present in the input array (ignoring negatives and numbers > n)
        for (int num : nums) {
            if (num > 0 && num <= n) {
                present[num] = true;  // Mark the number as present
            }
        }

        // Step 3: Find the first missing positive integer by checking the boolean array
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {  // If any number is missing, return it
                return i;
            }
        }

        // Step 4: If all numbers from 1 to n are present, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the number of elements:");
        int size = sc.nextInt();

        int[] nums = new int[size];

        // Input the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Find and print the smallest missing positive integer
        int result = findSmallestMissingPositive(nums);
        System.out.println("The smallest missing positive integer is: " + result);

        sc.close();
    }
}
