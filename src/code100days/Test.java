package code100days;


public class Test {

    public static Boolean canJump(int[] num){

        int maxReach = 0 ;

        for(int i = 0 ; i<num.length ; i++){

            if(i>maxReach){
                return false ;

            }

            maxReach = Math.max(maxReach , i + num[i]);

            if(maxReach>=num.length-1){
                return true ;
            }

        }
        return false ;
    }


    public static void main(String[] args) {

         int [] nums1 = {3,2,1,4};
        System.out.println("Can jump to last index : " + canJump(nums1));


        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can jump to the last index: " + canJump(nums2));



    }
}
