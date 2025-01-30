package code100days.Days_21_to_30;
import java.util.*;

public class MinSubarrayBinarySearch {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];

        // Step 1: Compute prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int minLen = Integer.MAX_VALUE;

        // Step 2: Iterate and apply binary search
        for (int i = 0; i < n; i++) {
            int requiredSum = target + prefixSum[i];
            int bound = Arrays.binarySearch(prefixSum, requiredSum);

            if (bound < 0) {
                bound = -bound - 1;
            }

            if (bound <= n) {
                minLen = Math.min(minLen, bound - i);
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println("Minimal length of subarray: " + minSubArrayLen(target, nums));
    }
}
