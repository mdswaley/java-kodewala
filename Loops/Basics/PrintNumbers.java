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




}
