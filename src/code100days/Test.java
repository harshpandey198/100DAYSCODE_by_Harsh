package code100days;

public class Test {

    public static int findPeakindex(int[] arrr){

        int left = 0 ;
        int right = arrr.length - 1;

        while(left<right){

            int mid = left + (right-left)/2 ;

            if(arrr[mid]<arrr[mid+1]){
                left = mid +1 ;

            }
            else{
                right = mid ;

            }
        }

        return left;



    }

    public static void main(String[] args) {

         int [] arrays = {1,3,4,2,1};

         int peakindex = findPeakindex(arrays);

        System.out.println("Peal element found at index:" + peakindex);

    }
}
