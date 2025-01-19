package code100days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static Map<Character , Integer> calculateCharacterFrequency(String str){
        // Initialze a Hash Map to store character frequencies
        Map<Character , Integer> frequencyMapChar = new HashMap<>();
        // Loop through each character in the string
        for(char ch : str.toCharArray()){
            // keep continuing if str has spaces
            if(ch== ' ')  continue ;
            // case sensitive
            ch = Character.toLowerCase(ch);

            //Update frequency in the map
            frequencyMapChar.put(ch , frequencyMapChar.getOrDefault(ch,0)+ 1);


        }

        return frequencyMapChar;
    }





    public static void main(String[] args) {


        // Step 1 : Enter a string , taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String input = sc.nextLine();

        // Step 2 : Call the method to calculate frequency
        Map<Character , Integer> frequencyMap = calculateCharacterFrequency(input);


        // Step 3 : Print the frequency

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }



    }
}
