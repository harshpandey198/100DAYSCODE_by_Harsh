package code100days.Days_11_to_20;
import java.util.*;

public class GroupAnagrams {

    // Method to group strings into anagrams
    public static List<List<String>> groupAnagrams(String[] strings) {
        // HashMap to group strings by their normalized form (key is the normalized form, value is a list of anagrams)
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strings) {
            // Normalize the string by removing spaces, special characters, and sorting its characters
            String normalized = normalizeString(str);

            // Check if the normalized form already exists in the map
            // If not, initialize a new list for this key
            anagramGroups.putIfAbsent(normalized, new ArrayList<>());

            // Add the original string to the list corresponding to the normalized form
            anagramGroups.get(normalized).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(anagramGroups.values());
    }

    // Helper method to normalize a string (used to identify anagram groups)
    private static String normalizeString(String str) {
        // Step 1: Remove all non-alphabetic characters using regex
        char[] chars = str.replaceAll("[^a-zA-Z]", "") // Retain only alphabetic characters
                .toLowerCase() // Convert all characters to lowercase for case insensitivity
                .toCharArray(); // Convert the cleaned string to a character array

        // Step 2: Sort the characters alphabetically
        Arrays.sort(chars);

        // Step 3: Return the sorted characters as a string (this becomes the "normalized form")
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of strings from the user
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt(); // Read the number of strings
        sc.nextLine(); // Consume the newline character

        // Step 2: Input the actual strings into an array
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine(); // Read each string from the user
        }

        // Step 3: Call the groupAnagrams method to group the strings into anagram groups
        List<List<String>> result = groupAnagrams(strings);

        // Step 4: Print the grouped anagrams
        System.out.println("Grouped Anagrams:");
        for (int i = 0; i < result.size(); i++) {
            // Print each group of anagrams as a list
            System.out.println("Group " + (i + 1) + ": " + result.get(i));
        }

        sc.close(); // Close the scanner
    }
}
