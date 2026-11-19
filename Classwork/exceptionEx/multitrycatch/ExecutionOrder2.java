package exceptionEx.multitrycatch;

public class ExecutionOrder2 {
    public static void main(String[] args) {

//        REMEMBER:-
//        you can't add only try block
//        need to add catch or finally block

        try {
            System.out.println("A");

            try {
                System.out.println("B");

                int x = 10 / 0; // here exception occur but it was not handle

                System.out.println("C"); // SKIP
            } finally {
                System.out.println("ZZZ"); // ALWAYS PRINT except System crash
            }

            System.out.println("D"); // SKIP

//            so exception handle here outer try-catch block
        } catch (ArithmeticException e) {
            System.out.println("E");
        }

        System.out.println("F");
    }
}

// Execution Order :- A -> B -> ZZZ -> E -> F
