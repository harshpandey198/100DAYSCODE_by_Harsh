
package code100days.Days_1_to_10;

import java.util.Scanner;

public class ArmstrongNumberChecker {

        // Method to check if a number is an Armstrong number
        public static Boolean checkArmstrong ( int number){
        int temp = number;
        int sum = 0;

        String str = Integer.toString(number);
        int size = str.length();

        while (temp > 0) {
            sum = (int) (sum + Math.pow(temp % 10, size)); // Raise each digit to the power of size and add to sum
            temp /= 10; // Remove the last digit
        }

            System.out.println("The sum of the digits raised to the power of the total digits is: " + sum);

        return sum == number; // Return true if the sum matches the original number
    }

        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check whether its an Armstrong or not :");
        int num = sc.nextInt();

        // Print whether the number is an Armstrong number
        System.out.println(num + (checkArmstrong(num) ? " is an Armstrong number , as it is matching with the value of number input by user" : " is not an Armstrong number, as it is not matching with the value of number input by user."));

        sc.close(); // Close the scanner
    }
    }

