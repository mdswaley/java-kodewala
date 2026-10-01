package ScannerExamples;

import java.util.Scanner;

public class ScannerExp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter you name : ");
        String name = sc.next();

        System.out.println("Enter price of the product : ");
        int price = sc.nextInt();  // nextInt()	One integer	Leaves \n behind like enter :- 100 --> 100\n

        sc.nextLine(); // consume left over

        System.out.println("Please enter delivery address : ");
        String address = sc.nextLine();

        System.out.println("Name is : "+name);
        System.out.println("Price is : "+price);
        System.out.println("Address is : "+address);
    }
}

/*
        The reason is specifically this combination:
        int price = sc.nextInt();
        String address = sc.nextLine();

        What happens step by step
        When you type:
        100⏎

        the input actually looks like:
        100\n

        When you execute:
        int price = sc.nextInt();

        nextInt() takes only:
        100

        It does not take the \n (Enter).
        So the Scanner is now positioned here:
        100\n
        ↑
        Scanner is here

        Then you immediately execute:
        String address = sc.nextLine();

        nextLine() means:
        "Read everything until the next newline."

        But the newline is already immediately there.
        Therefore, it reads:
        ""

        (empty string) and does not wait for you to type anything.

*/
/*
        Fix
        Add one nextLine() after nextInt():
        int price = sc.nextInt();

        sc.nextLine(); // consumes the leftover Enter

        System.out.println("Please enter delivery address : ");
        String address = sc.nextLine(); // now waits for address
*/