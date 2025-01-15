package code100days;

public class Test {

    public static int [] mergeKSortedArrays(int [][] arrays ){

        if(arrays.length == 0){

            return new int[0];
        }

        return mergeHelper(arrays,0 , arrays.length-1);


    }

    private static int[] mergeHelper (int [][]arr , int left ,int right){

        if(left==right){

            return arr[left];

        }

        int mid = left + (right-left)/2 ;


        int [] leftMerged = mergeHelper(arr,left,mid);
        int [] rightMerged = mergeHelper(arr,mid+1 ,right);

        return mergeTwoArrays(leftMerged,rightMerged);

    }

    private static int [] mergeTwoArrays (int[] arr1 , int [] arr2){

        int[] result = new int[arr1.length + arr2.length];
        int i = 0 ,j = 0 , k = 0 ;

        while(i<arr1.length && j <arr2.length){

            result [k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];

        }

        while(i<arr1.length){

            result [k++] = arr1[i++] ;
        }

        while(j<arr2.length){

            result [k++] = arr2[j++] ;
        }


        return result ;





    }






    public static void main (String[]args){

            int [][] array = { {1,4,6,8},{3,9,15,67},{2,5,7,10,56}};

            int[] mergeArray = mergeKSortedArrays(array) ;

        System.out.println("Merged Arrays");
            for (int num : mergeArray){
                System.out.print(num + " ");
            }





        }
    }

