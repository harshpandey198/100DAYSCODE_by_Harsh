package code100days.Days_11_to_20;
public class MergeKSortedArraysDivideConquer {

    // Main method to merge K sorted arrays
    public static int[] mergeKSortedArrays(int[][] arrays) {
        // If there are no arrays to merge, return an empty array
        if (arrays.length == 0) {
            return new int[0];
        }
        // Call the helper method to merge arrays using divide and conquer strategy
        return mergeHelper(arrays, 0, arrays.length - 1);
    }

    // Helper method to divide the problem into smaller subproblems and merge them
    private static int[] mergeHelper(int[][] arrays, int left, int right) {
        // Base case: if there is only one array, return it as it is already "merged"
        if (left == right) {
            return arrays[left];
        }

        // Divide the problem into two halves: left half and right half
        int mid = left + (right - left) / 2;

        // Recursively merge the left half and right half
        int[] leftMerged = mergeHelper(arrays, left, mid);
        int[] rightMerged = mergeHelper(arrays, mid + 1, right);

        // Merge the two halves and return the result
        return mergeTwoArrays(leftMerged, rightMerged);
    }

    // Method to merge two sorted arrays into one sorted array
    private static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        // Result array to store the merged values
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays by comparing elements one by one
        while (i < arr1.length && j < arr2.length) {
            // If element in arr1 is smaller, add it to the result array and move i
            result[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        // If there are remaining elements in arr1, add them to result
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2, add them to result
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        // Return the merged array
        return result;
    }

    // Main method to test the mergeKSortedArrays method
    public static void main(String[] args) {
        // Example input: 3 sorted arrays
        int[][] arrays = {
                {4, 5, 9},
                {2, 6 },
                {3, 7, 8, 89 , 90, 96}
        };

        // Merge the arrays
        int[] mergedArray = mergeKSortedArrays(arrays);

        // Print the merged array
        System.out.println("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
