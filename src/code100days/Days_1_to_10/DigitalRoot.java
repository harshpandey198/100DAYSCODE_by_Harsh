package code100days.Days_1_to_10;

public class DigitalRoot {

    // Approach 1: Recursive method to find the digital root
    public static int findDigitalRootRecursive(int num) {
        if (num < 10) {
            return num; // Base case: if the number is a single digit, return it
        }
        // Recursive case: calculate the sum of digits and call the method again
        return findDigitalRootRecursive(sumOfDigits(num));
    }

    // Helper method for Approach 1 to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Extract the last digit and add to the sum
            num /= 10;       // Remove the last digit
        }
        return sum;
    }

    // Approach 2: Using the digital root formula
    public static int findDigitalRootFormula(int num) {
        if (num == 0) {
            return 0; // If the number is 0, the digital root is 0
        }
        return 1 + (num - 1) % 9; // Formula-based digital root calculation
    }

    // Approach 3: Iterative method (inline within main method)
    public static int findDigitalRootIterative(int num) {
        while (num >= 10) { // Repeat until num is a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Extract and sum digits
                num /= 10;       // Remove the last digit
            }
            num = sum; // Assign the sum back to num for further reduction
        }
        return num;
    }

    // Approach 4: Optimized formula-based approach
    public static int findDigitalRoot(int num) {
        if (num == 0) {
            return 0; // If the number is 0, return 0
        }
        return (num % 9 == 0) ? 9 : num % 9; // Return the digital root
    }

    public static void main(String[] args) {
        int number = 9875; // Example number

        // Demonstrating Approach 1: Recursive method
        int digitalRootRecursive = findDigitalRootRecursive(number);
        System.out.println("Digital Root (Recursive): " + digitalRootRecursive);

        // Demonstrating Approach 2: Formula-based method
        int digitalRootFormula = findDigitalRootFormula(number);
        System.out.println("Digital Root (Formula): " + digitalRootFormula);

        // Demonstrating Approach 3: Iterative method
        int digitalRootIterative = findDigitalRootIterative(number);
        System.out.println("Digital Root (Iterative): " + digitalRootIterative);

        // Demonstrating Approach 4: Optimized formula-based method - Modulo 9
        int digitalRootOptimized = findDigitalRoot(number);
        System.out.println("Digital Root (Optimized Formula): " + digitalRootOptimized);
    }
}
