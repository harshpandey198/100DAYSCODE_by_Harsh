package Days_1_to_10;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
   static boolean isPalindrome(String str) {
        // Remove case sensitivity and ignore spaces (optional, depending on requirements)
        str = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0; // Pointer at the start of the string
        int right = str.length() - 1; // Pointer at the end of the string

        while (left < right) {
            // Compare characters at both ends
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If mismatch, not a palindrome
            }
            left++;  // Move left pointer inward
            right--; // Move right pointer inward
        }
        return true; // If loop completes, it is a palindrome
    }

    // Main method to test the palindrome checker
    public static void main(String[] args) {
        String input = "Racecar"; // Example string
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
