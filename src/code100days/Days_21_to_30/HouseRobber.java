package code100days.Days_21_to_30;

public class HouseRobber {

    // Method to find the maximum sum of non-adjacent house values
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;  // If there are no houses, return 0
        if (nums.length == 1) return nums[0];  // If only one house, return its value

        // Step 1: Initialize two variables to keep track of max sum
        int prev1 = 0; // Represents max sum excluding the current house
        int prev2 = 0; // Represents max sum including the current house

        // Step 2: Iterate through the array
        for (int num : nums) {
            int temp = prev1;  // Store previous max before updating
            prev1 = Math.max(prev1, prev2 + num);  // Choose max between skipping or robbing the house
            prev2 = temp;  // Update prev2 to previous max sum
        }

        // Step 3: Return the maximum sum possible
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};  // Example input
        System.out.println("Maximum money that can be robbed: " + rob(nums));  // Output: 12
    }
}
