package code100days;

public class Test {

    public static void printFibonacci(int n){

        if (n<=0){

            System.out.println("Enter positive number");
            return ;
        }

        int first = 0;
        int second = 1;

        for (int i = 0 ; i <n ;i++){
            System.out.print(first + " ");

            int next = first + second ;
            first = second ;
            second = next ;

        }
        System.out.println();

    }

    public static void main(String[] args) {

        int n = 10;
        printFibonacci(n);


    }
}
