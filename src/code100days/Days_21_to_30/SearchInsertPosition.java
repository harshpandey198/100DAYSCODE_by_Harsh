package code100days.Days_21_to_30;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Calculate mid-point to avoid overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        // Target not found, return insertion point
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        int target1 = 5;
        System.out.println("Index: " + searchInsert(nums, target1)); // Output: 2

        int target2 = 2;
        System.out.println("Index: " + searchInsert(nums, target2)); // Output: 1

        int target3 = 7;
        System.out.println("Index: " + searchInsert(nums, target3)); // Output: 4

        int target4 = 0;
        System.out.println("Index: " + searchInsert(nums, target4)); // Output: 0
    }
}
