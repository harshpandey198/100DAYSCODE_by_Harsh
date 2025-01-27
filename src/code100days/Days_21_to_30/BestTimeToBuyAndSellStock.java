package code100days.Days_21_to_30;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        // Step 1: Initialize variables
        int minPrice = Integer.MAX_VALUE;  // Track the minimum price so far
        int maxProfit = 0;                 // Track the maximum profit so far

        // Step 2: Iterate through price array
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell at the current price
            else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        // Step 3: Return the maximum profit found
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {3,2,1,4};
        System.out.println("Maximum profit: " + maxProfit(prices1));  // Output: 3

        int[] prices2 = {7,6,4,3,1};
        System.out.println("Maximum profit: " + maxProfit(prices2));  // Output: 0
    }
}
