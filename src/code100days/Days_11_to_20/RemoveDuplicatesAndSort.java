package code100days.Days_11_to_20;

import java.util.*;

public class RemoveDuplicatesAndSort {

    public static void main (String[]args){

        // Step 1 : Take input from the user about size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        // Step 2 : Initialize the input array
        int[] inputArray = new int[n];
        System.out.println("Enter the elements of the array:");

        // Step 3 : Populate the array with user provided input
        for(int i =0 ; i<n ; i ++){
            inputArray[i] = sc.nextInt();
        }

        //Step 4 : Use a HashSet to eliminate duplicate elements
        // Hashset automatically ensures all elements are unique
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : inputArray){
            uniqueElements.add(num);
        }

        //Step 5 : Convert the Hashset to a list for further processing.
        // We need a list to sort the elements because HashSet doesn't maintain order.
        List<Integer> sortedList = new ArrayList<>(uniqueElements);

        //Step 6 : Sort the list in descending order.
        // Collections.sort() sorts in ascending order by default .
        // We can use Collections.reverseOrder() to sort in descending order
        Collections.sort(sortedList, Collections.reverseOrder());

        //Step 7 : Print the resulting array.
        System.out.println("Array after removing duplicates and sorting in descending order:");
        for (int number : sortedList){
            System.out.print(number + " ");
        }
    }


}
