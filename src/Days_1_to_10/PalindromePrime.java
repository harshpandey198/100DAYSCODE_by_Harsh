package Days_1_to_10;

import java.util.Scanner;

public class PalindromePrime {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // If divisible, not a prime number
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
        }

        return original == reversed; // Check if the original is equal to the reversed number
    }

    // Method to find all numbers that are both palindromes and primes in a range
    public static void findPalindromePrimes(int start, int end) {
        System.out.println("Palindrome Prime Numbers between " + start + " and " + end + ":");
        boolean found = false;

        for (int num = start; num <= end; num++) {
            if (isPrime(num) && isPalindrome(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No numbers found in this range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.println("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range:");
        int end = sc.nextInt();

        // Find and display palindrome primes
        findPalindromePrimes(start, end);

        sc.close();
    }
}
