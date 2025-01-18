package code100days.Days_11_to_20;
import java.util.Scanner;

public class LongestCommonPrefix {

    // Method to find the longest common prefix
    public static String findLongestCommonPrefix(String[] strings) {
        // Step 1: Handle edge cases
        if (strings == null || strings.length == 0) {
            return ""; // If the input array is null or empty, return an empty string
        }

        // Step 2: Normalize the strings to handle case insensitivity and ignore special characters
        for (int i = 0; i < strings.length; i++) {
            strings[i] = normalizeString(strings[i]);
        }

        // Step 3: Use the first string as the base for comparison
        String prefix = strings[0];

        // Step 4: Compare the prefix with each string in the array
        for (int i = 1; i < strings.length; i++) {
            // Reduce the prefix until it matches the start of the current string
            while (!strings[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // Remove the last character of the prefix

                // If the prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Step 5: Return the final longest common prefix
        return prefix;
    }

    // Helper method to normalize a string (convert to lowercase and remove non-alphabetic characters)
    private static String normalizeString(String str) {
        return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of strings
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt(); // Read the number of strings
        sc.nextLine(); // Consume the newline character

        // Step 2: Input the strings into an array
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine(); // Read each string
        }

        // Step 3: Call the method to find the longest common prefix
        String longestPrefix = findLongestCommonPrefix(strings);

        // Step 4: Print the result
        if (longestPrefix.isEmpty()) {
            System.out.println("There is no common prefix among the strings.");
        } else {
            System.out.println("The longest common prefix is: " + longestPrefix);
        }

        sc.close(); // Close the scanner
    }
}
