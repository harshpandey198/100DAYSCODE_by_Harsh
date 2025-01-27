package code100days;


public class Test {

    public static int maximumProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0 ;

        for(int price : prices ){

            if(price < minPrice){
                minPrice = price ;

            }

           else{
                int profit = price - minPrice;
               maxProfit = Math.max(maxProfit, profit);

            }

        }
        return maxProfit ;
    }


    public static void main(String[] args) {

         int [] nums1 = {3,2,1,4};
        System.out.println("Maximum Profit: " + maximumProfit(nums1));


        int[] nums2 = {3, 2, 1, 0, -2};
        System.out.println("Maximum Profit: " + maximumProfit(nums2));



    }
}
