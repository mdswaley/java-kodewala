package exceptionEx.multitrycatch;

public class ExecutionOrder4 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("A");

            int y = 20 / 0; // we are not handle exception here. so JVM throw exception (program crash)

            System.out.println("B");

        } finally {
            System.out.println("C"); // Execute
        }

        System.out.println("kdfl"); // Not Execute
        // because the exception propagates to the JVM.
    }
}

// Execution Order :- A -> C -> System exit
// Next to start from Level 3 – Advanced interview questions
