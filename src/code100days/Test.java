package code100days;

import java.util.Scanner;

public class Test {

    public static int findSmallestMissingPositive (int[] nums){

        int n = nums.length ;

        // create a boolean array to mark presence of numbers from 1 to n

        boolean[] present = new boolean[n+1];

     // acknowledge whether the num is present or not
        for(int num : nums){
            if(num>0 && num<=n){
                present[num] = true;
            }
        }

        for (int i = 1 ; i <=n ; i ++){
            if(!present[i]){
                return i;

            }
        }

        return n+1;

    }


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements");

        int size = sc.nextInt();


        int[] nums = new int[size];

        System.out.println("Enter each elements ");

        for (int i = 0 ; i < size ; i ++){
            nums[i] = sc.nextInt();

        }

        int result = findSmallestMissingPositive(nums);

        System.out.println("the missing no is " +result);

        sc.close();



    }
}
