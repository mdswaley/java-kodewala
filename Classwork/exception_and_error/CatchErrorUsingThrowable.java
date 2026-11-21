package exception_and_error;

/**
 * What happens if we catch Throwable?
* */
public class CatchErrorUsingThrowable {
    public static void main(String[] args) {
        try {
            recursive();
        } catch (Throwable t) {
            System.out.println("Throwable caught");
        }
    }

    public static void recursive() {
        recursive();
    }
}

// IMPORTANT:----
// Both Exception and Error extend Throwable.
//
//Therefore, catch(Throwable t) can catch StackOverflowError if the
// JVM can successfully deliver it to the handler.
//
//However, catching serious errors does not mean the application is safe to continue.
