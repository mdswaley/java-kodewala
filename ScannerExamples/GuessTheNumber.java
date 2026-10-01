package ScannerExamples;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int luckyNum = 7;
        int userInput = 0;

        while (luckyNum != userInput){
            System.out.println("Please enter a number : ");
            userInput = sc.nextInt();

            if (userInput < luckyNum){
                System.out.println("Enter larger number than current..");
            }else if (userInput > luckyNum){
                System.out.println("Enter smaller number than current..");
            }else {
                System.out.println("You Won!!");
            }
        }

        sc.close();
    }
}
