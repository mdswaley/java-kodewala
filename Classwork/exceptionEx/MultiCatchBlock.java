package exceptionEx;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String[] address = {"BTM", "Stage 1", "Bangalore"};
        doSomething("SBI-0923489287", address);
    }

    public static void doSomething(String accNo, String[] address){

        System.out.println("----Start----");

        try{
            int len = accNo.length();
            String state = address[3];

            int value = 10 / 0;
        }
        catch (NullPointerException e){
            System.out.println("accessing null value.");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index doesn't exist.");
            e.printStackTrace();
        }

//        if you add Exception catch block on the top of all other catch block. Then there is compiled error
//        bcz Exception going to handle all the other exception.
//        so other exception are not reachable

        catch (Exception e){ // Exception is a parent of all the exception. so here is down-cast happening.
            // e.i Exception e = new ArithmeticException();
            System.out.println("Unknown exception.");
            e.printStackTrace();
        }

        System.out.println("------End-----");
    }
}
