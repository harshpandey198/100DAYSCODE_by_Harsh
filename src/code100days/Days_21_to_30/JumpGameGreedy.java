package code100days.Days_21_to_30;

public class JumpGameGreedy {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;  // Step 1: Track the farthest reachable index

        for (int i = 0; i < nums.length; i++) {
            // Step 2: Check if the current index is beyond our reachable range
            if (i > maxReach) {
                return false;  // If we can't reach this index, return false
            }

            // Step 3: Update the farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);

            // Step 4: Check if we've reached or exceeded the last index
            if (maxReach >= nums.length - 1) {
                return true;  // We can reach the end of the array
            }
        }

        return false;  // If we exit the loop and haven't reached the end
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Can jump to the last index: " + canJump(nums1));

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can jump to the last index: " + canJump(nums2));
    }
}
