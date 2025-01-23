package code100days;

import java.util.*;

public class Test {

    public static void twosum(int[] arr , int tar){


        //Step 1 : Creating a hashmap to store the key value pairs means , the elements and their indices
       HashMap<Integer , Integer> map = new HashMap<>();

       // Step 2 : Lopp through the array

        for(int i =0 ; i<arr.length ; i ++){

            // Step 3 : Calculating the compliment , the number which is used to reach the target value
            int complement = tar - arr[i];

            //Step 4 :
            if(map.containsKey(complement)){

                System.out.println("The pair of elements whose sum equals" + tar + " are:  " + arr[map.get(complement)] + " and " + arr[i] + " (indices : " + map.get(complement) + " , "+ i + ")" );
                return;
            }
            map.put(arr[i],i);

        }
    }

    public static void main(String[] args) {

         int [] arrays = {-2,3,4,-6,2};

         int target = -4 ;

         twosum(arrays,target);

    }
}
