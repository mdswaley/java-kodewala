package ScannerExamples;

import java.util.Scanner;

public class ScannerExp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 0;

        System.out.println("Please enter the price : ");

//        if(sc.hasNextInt()){
//            price = sc.nextInt();
//        }else{
//            System.out.println("Please enter the valid price...");
//        }

        while (sc.hasNextInt()){
            price = sc.nextInt();
            System.out.println("current price is : "+price);
        }

        System.out.println("exit from loop..");

//        System.out.println("Price is : "+price);

        sc.close();

    }
}
