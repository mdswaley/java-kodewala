package exceptionEx;

/**
 * Handel Exception using try-catch
 */
public class HandelException {
    public static void main(String[] args) {
        System.out.println("--- START ---");

        HandelException exception = new HandelException();
        exception.doSomething();

        System.out.println("--- END ---");
    }

    public void doSomething(){
        System.out.println("--- doSomething START ---");

        int amount = 100;

        String name = null;

//        if you are getting multiple exception in try block.
//        better to throw the exception type and handle it from main method
//        using try-catch (Exception e)
        try {
            System.out.println(name.length()); // if exception get here then rest of line in try block will skip
            System.out.println(amount/0);

            System.out.println("after try");
        }
        catch (NullPointerException e)
        {
            System.out.println("name is null...");
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            System.out.println("amount is / by zero...");
            e.printStackTrace();
        }

        System.out.println("--- doSomething END ---");
    }
}
