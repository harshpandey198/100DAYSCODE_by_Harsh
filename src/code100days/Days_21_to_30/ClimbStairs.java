package code100days.Days_21_to_30;

public class ClimbStairs {
    public static int climbStairs(int n) {
        // Base cases: If there's only 1 step, there's only 1 way to climb it
        if (n == 1) return 1;

        // If there are 2 steps, there are 2 ways: (1+1) or (2)
        if (n == 2) return 2;

        // Variables to track previous two step results
        int prev1 = 2;  // Number of ways to climb 2 steps
        int prev2 = 1;  // Number of ways to climb 1 step
        int current = 0; // This will store the ways to climb n steps

        // Start from step 3 and calculate ways up to n
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2; // The number of ways to climb i steps
            prev2 = prev1;  // Move prev1 to prev2 for the next iteration
            prev1 = current; // Update prev1 with the current result
        }

        // The final value of `current` will be the answer for n steps
        return current;
    }

    public static void main(String[] args) {
        // Calling the function with n = 5
        System.out.println(climbStairs(5)); // Output: 8
    }
}

