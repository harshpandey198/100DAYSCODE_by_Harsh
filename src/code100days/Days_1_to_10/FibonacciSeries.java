package code100days.Days_1_to_10;

public class FibonacciSeries {

    // Method to print the Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0; // First term of the Fibonacci series
        int second = 1; // Second term of the Fibonacci series

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print the current term

            // Update for the next iteration
            int next = first + second; // Next term is the sum of the previous two terms
            first = second; // Shift 'second' to 'first'
            second = next; // Assign the new term to 'second'
        }

        System.out.println(); // Add a new line at the end
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int n = 10; // Example: Generate Fibonacci series for 10 terms
        printFibonacciSeries(n);
    }
}
