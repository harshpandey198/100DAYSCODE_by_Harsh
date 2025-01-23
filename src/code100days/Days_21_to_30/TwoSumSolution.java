package code100days.Days_21_to_30;
import java.util.HashMap;

public class TwoSumSolution {

    // Method to find two numbers that sum up to the target value
    public static void twosum(int[] arr , int tar){

        // Step 1: Create a HashMap to store elements and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Loop through the array elements
        for (int i = 0; i < arr.length; i++) {

            // Step 3: Calculate the complement (the number needed to reach the target)
            int complement = tar - arr[i];

            /*
             Explanation of complement:
             - If we want two numbers to sum to the target (tar),
               then one number + another number = target.
             - Rearranging the equation: another number = target - current number.
             - This means that for each number we process, we check if its
               complement (target - current number) exists in the map.
            */

            // Step 4: Check if the complement already exists in the HashMap
            if (map.containsKey(complement)) {

                // Step 5: If found, print the indices of the two numbers
                System.out.println("The pair of elements whose sum equals " + tar + " are: "
                        + arr[map.get(complement)] + " and " + arr[i]
                        + " (indices: " + map.get(complement) + ", " + i + ")");
                return;  // Exit the function once we find a valid pair
            }

            // Step 6: Store the current array element and its index in the HashMap
            map.put(arr[i], i);  // Storing arr[i] as key and index i as value
        }

        // Step 7: If no such pair is found, print this message
        System.out.println("No pair found with the given target.");
    }

    public static void main(String[] args) {
        // Input array
        int [] arrays = {-2, 3, 4, -6, 2};

        // Target sum value
        int target = -4;

        // Step 8: Call the method to find two sum
        twosum(arrays, target);
    }
}
