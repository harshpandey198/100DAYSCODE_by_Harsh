package code100days;

import java.util.*;


public class Test {

    public static String findLongestCommonprefix(String[] string){

        // Step 1 : Handle edge case
        if (string == null ||  string.length == 0){
            return "";

        }

        // Step 2 : Normalize the string
        for ( int i = 0 ;  i <string.length ; i ++){
            string[i] = normalizeString(string[i]);

        }


        // Step 3 : Use the first string as base of comparison

        String prefix = string[0];

        //Step 4 : Compare the prefix with each string
        for (int i =1 ; i <string.length ; i++){

            // reduce the prefix until it matches with start of the current string

            while(!string[i].startsWith(prefix)){

                prefix = prefix.substring(0,prefix.length() -1);// Remove the last character of the prefix

                // If prefix becomes , empty , there is no common string
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        // Step 5: Return the final longest common prefix
        return prefix ;


    }

    private static String normalizeString(String str){

        return str.replaceAll("[^a-zA-Z]","").toLowerCase();

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Step 1 :- Take input of no of strings
        System.out.println(" Enter no of strings");
        int n = sc.nextInt();
        sc.nextLine();

        // Step 2 :- Insert strings into an array
        String[] str = new String[n];
        System.out.println(" Enter the strings ");
        for (int i = 0; i <n ; i ++){

            str[i] = sc.nextLine();

        }

        // Step 3 :- Call the method to find the longest common prefix

        String longestCommonprefix = findLongestCommonprefix(str);

        // Step 4 :- Print the result

        if (longestCommonprefix.isEmpty()){
            System.out.println("There is no common prefix in the string ");
        }

        else {
            System.out.println(" The longest common prefix is " + longestCommonprefix);
        }

        sc.close();



    }
}
