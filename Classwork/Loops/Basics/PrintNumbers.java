package Loops.Basics;

public class PrintNumbers {
    public static void main(String[] args) {
        printStToEnd(1, 50);

        System.out.println();

        printEndToSt(50, 1);

        System.out.println();

        printStToEndEven(1, 20);

        System.out.println();

        printStToEndOdd(20, 40);

        System.out.println();

        printMultiplication(5);

        System.out.println("\nSum of N number is : "+printSumOfNNumber(10));

        System.out.println("Factorial of n is : "+printFactOfN(5));
    }

    public static void printStToEnd(int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(i+" , ");
        }
    }

    public static void printEndToSt(int end, int start){
        for (int i = end; i >= start; i--) {
            System.out.print(i+" , ");
        }
    }

    public static void printStToEndEven(int start, int end){
        for (int i = start; i <= end; i++) {
            if(i % 2 == 0){
                System.out.print(i+" , ");
            }
        }
    }

    public static void printStToEndOdd(int start, int end){
        for (int i = start; i <= end; i++) {
            if(i % 2 != 0){
                System.out.print(i+" , ");
            }
        }
    }

    public static void printMultiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }

    public static int printSumOfNNumber(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int printFactOfN(int n){
        int fact = 1;

        for(int i=1;i<=n;i++){
            fact *= i;
        }

        return fact;
    }



}
