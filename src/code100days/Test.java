package code100days;

import java.util.HashMap;

public class Test {

    public static int findMajorityElement(int [] n){

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : n){

            countMap.put(num, countMap.getOrDefault(num,0)+1);


            if(countMap.get(num) > n.length/2){
                return num ;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

         int [] nums = {2,4,3,2,2};

         int result = findMajorityElement(nums);

        System.out.println("The Majority element in the array is :" + result);

    }
}
