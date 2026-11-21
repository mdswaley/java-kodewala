package exception_and_error;

/**
 * Can a return statement in finally change the result?
 * */
public class ReturnStatementInFinallyBlock {
    public static void main(String[] args) {
        int res = show();

        System.out.println(res);
    }

    public static int show(){
        try {
            return 10;
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }
        finally {
            return 20;
        }
    }
}

// The return inside finally overrides the return value from the try block.
//
//Interview point: Avoid returning from finally because it can suppress exceptions and override return values.
