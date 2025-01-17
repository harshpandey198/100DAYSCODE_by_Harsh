package code100days;

import java.util.*;


public class Test {

    public static List<List<String>> groupAnagrams (String[] string){


        // HashMap to group strings by their normalized form (key is the normalized form, value is a list of anagrams).
        Map<String , List<String>>  anagramsGroup = new HashMap<>() ;

        for(String str : string){

            String normalized = normaliseString(str);


            anagramsGroup.putIfAbsent(normalized , new ArrayList<>());

            anagramsGroup.get(normalized).add(str);

        }

        ArrayList<List<String>> stri = new ArrayList<>(anagramsGroup.values()) ;

        return stri;

    }

    private static String normaliseString (String strings){

        char[] chars = strings.replaceAll("[^a-zA-Z]", "") // Retain only alphabetic characters
                .toLowerCase() // Convert all characters to lowercase for case insensitivity
                .toCharArray() ;


        Arrays.sort(chars);

        String st = new String(chars) ;

        return st ;



    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

       // Step1 :- Input no of strings
        System.out.println("Enter the no of strings");
        int n = sc.nextInt();
        sc.nextLine();


        //Step 2 :- Input all the strings values

        String[]  str = new String[n];
        System.out.println("Enter string values");

        for ( int i = 0 ; i <n ; i++){
            str[i] = sc.nextLine();
        }

        // Step 3: Call the groupAnagrams method to group the strings into anagram groups
        List<List<String>> result = groupAnagrams(str);

        //Step 4 : Print the groupAngrams
        System.out.println("Grouped Anagrams :" );
        for(int i = 0 ; i<result.size(); i ++){
            System.out.println("Group :" + (i+1) + " :" + result.get(i) );
        }

        sc.close();

    }
}
