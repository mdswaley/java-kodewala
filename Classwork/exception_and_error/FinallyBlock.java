package exception_and_error;

/**
 * Does finally block always execute ?
 */
public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("A");

            System.exit(0);

            System.out.println("B");
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }
        finally {
            System.out.println("C");
        }

        System.out.println("D");
    }
}
//System.exit(0) terminates the JVM immediately. Therefore, the finally block does not
// get an opportunity to execute.

/*
Exit status	Meaning
System.exit(0)	Program terminated successfully
System.exit(1)	Program terminated with an error or abnormal condition
System.exit(2)	Another application-defined error status
System.exit(100)	Another application-defined status
*/
