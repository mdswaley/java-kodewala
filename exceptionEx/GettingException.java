package exceptionEx;

/**
 * Unhandled Exception Getting
* */

public class GettingException {
    public static void main(String[] args) {

        System.out.println("---- START ----");

        int amount = 100;
        int part = 0;

//        System.out.println(amount/part); // ArithmeticException :- divide a number by 0

        Account account = null;
//        System.out.println(account.hashCode()); // NullPointerException :- something is null and you access it

        int marks = Integer.parseInt(args[0]); // if you not pass the arguments

        System.out.println(marks); // ArrayIndexOutOfBoundsException :-  access an index which doesn't exist

        System.out.println("---- END ----");

    }
}

class Account{

}
