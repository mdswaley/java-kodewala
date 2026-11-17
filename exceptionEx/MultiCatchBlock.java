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
        catch (Exception e){ // Exception is a parent of all the exception. so here is down-cast happening
            System.out.println("Unknown exception.");
            e.printStackTrace();
        }

        System.out.println("------End-----");
    }
}
