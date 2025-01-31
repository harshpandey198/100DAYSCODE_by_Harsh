package code100days.Days_21_to_30;

public class ContainerWithMostWater {

    // Method to find the maximum area of water that can be stored
    public static int maxArea(int[] height) {
        // Step 1: Initialize two pointers at the beginning and end of the array
        int left = 0, right = height.length - 1;
        int maxWater = 0; // Variable to track the maximum water stored

        // Step 2: Use a while loop to iterate until the two pointers meet
        while (left < right) {
            // Step 3: Calculate the width between left and right pointers
            int width = right - left;

            // Step 4: Find the minimum height between the two lines
            int minHeight = Math.min(height[left], height[right]);

            // Step 5: Calculate the area using width * minHeight
            int area = width * minHeight;

            // Step 6: Update the maxWater variable if the new area is larger
            maxWater = Math.max(maxWater, area);

            // Step 7: Move the pointer with the smaller height to try and find a taller line
            if (height[left] < height[right]) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }

        // Step 8: Return the maximum water found
        return maxWater;
    }

    public static void main(String[] args) {
        // Step 9: Example input
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Step 10: Call the maxArea function and print the result
        System.out.println("Maximum Water Stored: " + maxArea(height));  // Output: 49
    }
}
