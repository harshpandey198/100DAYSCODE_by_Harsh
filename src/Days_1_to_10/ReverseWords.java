package Days_1_to_10;

import java.util.Scanner;

public class ReverseWords {

    // Method to reverse each word in the sentence
    public static String reverseEachWord(String sentence) {
        // Check if the sentence is null, empty, or contains only spaces
        if (sentence == null || sentence.trim().isEmpty()) {
            return "Sentence is empty"; // Return a message if the sentence is empty or contains only spaces
        }

        // Split the sentence into separate words based on whitespace
        String[] words = sentence.split("\\s+");

        // StringBuilder to hold the final result
        StringBuilder result = new StringBuilder();

        // Loop through each word in the words array
        for (String word : words) {
            // Reverse the current word using StringBuilder
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            // Append the reversed word to the result along with a space
            result.append(reversedWord).append(" ");
        }

        // Return the final string after trimming any extra spaces at the end
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the sentence which you want to reverse:");

        // Read the input sentence
        String input = sc.nextLine();

        // Call the method to reverse the words in the sentence
        String output = reverseEachWord(input);

        // Print the original and reversed sentences
        System.out.println("Original Sentence: " + input);
        System.out.println("Reversed Words with Reversed Characters: " + output);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
