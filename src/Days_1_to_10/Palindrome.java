package Days_1_to_10;

public class Palindrome {
    // Method to check if a number is a palindrome
    static boolean checkPalindrome(int n) {
        int reverse = 0;  // Stores the reversed digits of the number
        int temp = n;    // Using temp var so that original number 'n' remains unchanged while reversing

        while (temp != 0) {  // Until temp is not 0
            reverse = (reverse * 10) + (temp % 10);  // Construct the reversed number incrementally by shifting the current digits left
                                                    // (multiplying reverse by 10) and appending the last digit of the current number (temp % 10).
            temp = temp / 10;  // Remove the last digit of temp
        }

        return (reverse == n);  // If they are equal, the number is a palindrome, and the method returns true. Otherwise, it returns false.
    }

    public static void main(String[] args) {
        int n = 12321;  // Number to be checked for palindrome

        if (checkPalindrome(n)) {  // Calls the checkPalindrome method with n as the argument
                                  // If the method returns true, prints true to the console. Otherwise, prints false.
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
