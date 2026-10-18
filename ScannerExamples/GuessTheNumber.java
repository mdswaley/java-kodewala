package ScannerExamples;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int luckyNum = (int) (Math.random() * 10) + 1;
//        int luckyNum2 = (int) Math.random() * 10; // (int) Math.random() --> Math.random() (return 0.3, 0.7 etc)
        // --> (int) Math.random() (convert to 0) --> result 0 * 10 --> 0 . for that it give 0 always

        int luckyNum2 = (int) (Math.random() * 10) + 1; // here after bracket (Math.random() * 10)
        // --> return 3.2, 7.2 etc --> (Math.random() * 10) (it only give till 0 - 9) but we want 0 - 10. so
        // (Math.random() * 10) + 1 which increase one more.

        System.out.println("luckyNum : "+luckyNum);
        System.out.println("luckyNum2 : "+luckyNum2);
        int userInput = 0;

//        while (luckyNum != userInput){
//            System.out.println("Please enter a number : ");
//            userInput = sc.nextInt();
//
//            if (userInput < luckyNum){
//                System.out.println("Enter larger number than current..");
//            }else if (userInput > luckyNum){
//                System.out.println("Enter smaller number than current..");
//            }else {
//                System.out.println("You Won!!");
//            }
//        }
//
//        sc.close();
    }
}
