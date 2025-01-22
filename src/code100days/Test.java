package code100days;

import java.util.*;

public class Test {

    public static List<String> countDistinctString(String str){

        // using a hashset to store unique subtrings
        Set <String> uniquesubstrings = new HashSet<>();

        // Step 2 : generate all substrings using nested  loop

        for (int i =0 ; i<str.length(); i++){
            StringBuilder sb = new StringBuilder();

            for (int j =i ; j<str.length() ; j++){

                sb.append(str.charAt(j));

            }
            // Step 3 : adding the substring to the set and that too a unique one
            uniquesubstrings.add(sb.toString());

        }


  // cinvert the set to a string and return
        return  new ArrayList<>(uniquesubstrings);
    }






    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String inputString = sc.nextLine();

        List<String> result = countDistinctString(inputString);

        // Distinct substrings
        System.out.println("Distinct substrings");
        for (String substring : result){
            System.out.print(substring + " , ");
        }
        System.out.println(" ");
        //Result
        System.out.println("The count of Distinct string is " + result.size());

        sc.close();



    }
}
