package exception_and_error;

/**
 * What happens when an exception occurs inside finally?
 * */
public class ExceptionInFinallyBlock {
    public static void main(String[] args) {
        int a = 0;

        try {
            a = 10 / 0;
        }
        finally {
            String s = null;
            s.length();
        }
    }
}

// o/p :- java.lang.NullPointerException

//There are two exceptions:
//        1. First exception: ArithmeticException from the try block.
//        2. Second exception: NullPointerException from the finally block.

//The exception thrown from finally replaces the exception already propagating from try.
