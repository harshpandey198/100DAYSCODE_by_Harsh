package code100days;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static int findKthSmallest(int [] array , int kth){

        Arrays.sort(array);

        return array[kth-1];
    }

    public static int findKthLargest(int [] array , int kth){

        Arrays.sort(array);

        return array[array.length-kth];

    }





    public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array ");

            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter array elements ");
            for (int i = 0 ; i <n ; i ++){

                arr[i] = sc.nextInt();

            }
            System.out.println("Enter kth number");
            int k = sc.nextInt();

            // Check if k is within valid bounds
            if (k > 0 && k <= n) {
                // Find and print the kth smallest and kth largest elements
                int kthSmallest = findKthSmallest(arr, k);
                int kthLargest = findKthLargest(arr, k);

                System.out.println("The " + k + "th smallest element is: " + kthSmallest);
                System.out.println("The " + k + "th largest element is: " + kthLargest);
            } else {
                System.out.println("Invalid value of k. It should be between 1 and " + n);
            }



            sc.close();


        }
    }

