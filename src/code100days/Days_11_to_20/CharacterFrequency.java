package code100days.Days_11_to_20;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

    // Method to calculate the frequency of characters in a string.
    public static Map<Character, Integer> calculateCharacterFrequency(String input) {
        // Initialize a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            // Ignore spaces (optional)
            if (ch == ' ') continue;

            // Convert to lowercase for case-insensitivity (optional)
            ch = Character.toLowerCase(ch);

            // Update frequency in the map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap; // Return the frequency map
    }

    public static void main(String[] args) {
        // Step 1: Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Step 2: Call the method to calculate frequencies
        Map<Character, Integer> frequencyMap = calculateCharacterFrequency(input);

        // Step 3: Print the frequency of each character
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
