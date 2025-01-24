package code100days.Days_21_to_30;
public class PeakElementFinder {

    public static int findPeakElement(int[] nums) {
        int left = 0;  // Step 1: Initialize left pointer to the start of the array
        int right = nums.length - 1;  // Step 2: Initialize right pointer to the end of the array

        while (left < right) {  // Step 3: Continue searching while left < right
            int mid = left + (right - left) / 2;  // Step 4: Find the middle index to divide the array

            // Step 5: Compare the middle element with its right neighbor
            if (nums[mid] < nums[mid + 1]) {
                // Step 6: If mid element is smaller than the right one, move to the right half
                left = mid + 1;
            } else {
                // Step 7: If mid element is greater, a peak exists in the left half (or mid is a peak)
                right = mid;
            }
        }

        // Step 8: At the end, left and right will converge to the peak element index
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 2,1,5};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element found at index: " + peakIndex);
    }
}
