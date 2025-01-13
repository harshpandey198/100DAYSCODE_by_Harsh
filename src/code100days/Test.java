package code100days;

import java.util.Arrays;
import java.util.Scanner;

public class Test {


public static void rotateArrays(int [] array , int ksize){

    int n = array.length ;

    ksize = ksize%n;

    //first step - reverse entire array
    reverseArrays(array , 0,n-1);

    //second step - reverse  array now from start to only ksize-1
    reverseArrays(array , 0 ,ksize-1 );

    // third step - reverse remaining portion of array
    reverseArrays(array,ksize,n-1);

    System.out.println(Arrays.toString(array));

}

public static void reverseArrays(int [] arrry , int start , int end ){

        while(start<end){

            int temp = arrry[start];
            arrry[start]= arrry[end];
            arrry[end]=temp;

            start ++;
            end --;

        }
}


        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array ");

            int n = sc.nextInt();



            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0 ; i <n; i ++){

                arr [i] = sc.nextInt();
            }

            System.out.println("Enter the no of positions it should shift to right ");
            int k = sc.nextInt();

          rotateArrays(arr,k);

            sc.close();


        }
    }

