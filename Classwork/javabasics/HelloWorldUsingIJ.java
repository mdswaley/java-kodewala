package javabasics;
import java.util.Scanner;

public class HelloWorldUsingIJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = args[0]; // run / debug configuration --> edit config --> program argument
        System.out.println("Hello world from Intellij Idea..."+s);

        int amount = 100;

        System.out.println("Amount : "+amount);
    }
}
