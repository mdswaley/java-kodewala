package exceptionEx.multitrycatch;

public class ExecutionOrder3 {
    public static void main(String[] args) {
        try {
            System.out.println("A");

            try {
                System.out.println("B");
                int x = 10 / 0;

            } catch (ArithmeticException e) {
                System.out.println("C");

            } finally {
                System.out.println("D");
            }

            System.out.println("E");

        } catch (Exception e) {
            System.out.println("F");
        }
    }
}

// Execution Order :- A -> B -> C -> D -> E
