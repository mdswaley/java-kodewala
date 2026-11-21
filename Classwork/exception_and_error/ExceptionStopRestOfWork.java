package exception_and_error;

/**
 * Does an exception stop the execution of the remaining statements?
 * */
public class ExceptionStopRestOfWork {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            System.out.println("B");
            int res = 10 / 0;
            System.out.println("C"); // skipped
        }
        catch (ArithmeticException e){
            System.out.println("D");
            System.out.println("/ by zero exception");
            e.printStackTrace();
        }

        System.out.println("E");
    }
}

//When an exception occurs, the remaining statements in the try block are skipped.
// Control transfers to the matching catch block.
//
//The statements after the try-catch execute normally.