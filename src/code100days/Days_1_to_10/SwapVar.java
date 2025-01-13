package code100days.Days_1_to_10;

public class SwapVar
{
    public static void main (String[] args) {

        int a = 6 ;
        int b = 7 ;
        int c = 8 ;
        int d = 9 ;

        System.out.println("1st Approach");
        System.out.println("Before Swap :- " + "a = "+ a + ","+ "b = " + b);
        // Approach 1 :-Below is using Arithmetic Operations
        a = a + b ; // 6 + 7 = 13
        b = a - b ; // 13 - 7 = 6
        a = a - b ; // 13 - 6 = 7

        System.out.println("After Swap :- " + "a = "+ a + ","+ "b = " + b);
        System.out.println("---------------------------------------------");
        System.out.println("2nd Approach");
        System.out.println("Before Swap :- " + "c = "+ c + ","+ "d = " + d);
        // Approach 2 :- Using BITWISE XOR

        c = c ^ d ; // 8 ^ 9 = 0001 in binary , which is equal to 1 in numeric so , c = 1 now
        d = c ^ d ; // 1 ^ 9 = 1000 in binary , which is equal to 8 in numeric so , d = 8 now
        c = c ^ d ; // 1 ^ 8 = 1001 in binary , which is equal to 9 in numeric so , c = 9 now

        System.out.println("After Swap :- " + "c = "+ c + ","+ "d = " + d);



    }
}
