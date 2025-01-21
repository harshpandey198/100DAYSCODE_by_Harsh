package code100days;

import java.util.Scanner;

public class Test {

    public static void rearrangeArray(int[] array){

        int n = array.length;

        //create new array to store the value

        int[] temp = new int[n];
        int index = 0;

        // keeping negative integers at start

        for(int nums : array){
            if(nums<0){
                temp[index++] = nums;

            }
        }

        //storing positive value after negative value
        for(int nums : array){
            if(nums>0){
                temp[index++] = nums;
            }
        }

        // storing zeroes at last
        for(int nums : array){
            if(nums==0){
                temp[index++] = nums;

            }
        }

        System.arraycopy(temp,0,array,0,n);


    }




    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements inside array");

        for(int i = 0 ; i <n ; i++){
            arr[i] = sc.nextInt();
        }

        rearrangeArray(arr);
        System.out.print("Rearranged arrray" );
       for(int num : arr){
           System.out.print( num + " ");
       }


        sc.close();

    }
}
