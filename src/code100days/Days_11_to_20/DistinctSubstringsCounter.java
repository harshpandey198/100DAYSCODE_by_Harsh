package code100days.Days_11_to_20;
import java.util.*;

public class DistinctSubstringsCounter {

    // Method to count distinct substrings and return them
    public static List<String> getDistinctSubstrings(String s) {
        // Step 1: Use a HashSet to store unique substrings
        Set<String> uniqueSubstrings = new HashSet<>();

        // Step 2: Generate all substrings using nested loops
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));  // Build substring character by character

                // Step 3: Add the substring to the set (only unique ones will be stored)
                uniqueSubstrings.add(sb.toString());
            }
        }

        // Step 4: Convert the set to a list and return
        return new ArrayList<>(uniqueSubstrings);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        // Step 2: Call the method to get unique substrings
        List<String> result = getDistinctSubstrings(inputString);

        // Step 3: Print all unique substrings
        System.out.println("Distinct substrings:");
        for (String substring : result) {
            System.out.print( substring + ", ");
        }
        System.out.println(" ");
        System.out.println("Number of distinct substrings: " + result.size());

        sc.close();
    }
}
