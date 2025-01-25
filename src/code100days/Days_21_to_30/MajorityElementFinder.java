package code100days.Days_21_to_30;
import java.util.HashMap;

public class MajorityElementFinder {
    public static int findMajorityElement(int[] nums) {
        // Step 1: Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Step 2: Traverse the array and populate the HashMap
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // Step 3: Check if the current element's count exceeds n/2
            if (countMap.get(num) > nums.length / 2) {
                return num;
            }
        }

        // Step 4: If no majority element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,5,5,5};
        int result = findMajorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
