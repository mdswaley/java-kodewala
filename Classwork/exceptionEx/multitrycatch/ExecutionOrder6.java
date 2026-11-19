package exceptionEx.multitrycatch;

public class ExecutionOrder6 {
    public static void main(String[] args) {
        try {
            System.out.println("A");

            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("B");
                int y = 20 / 0;
            } finally {
                System.out.println("C");
            }

            System.out.println("D");

        } catch (ArithmeticException e) {
            System.out.println("E");

        } finally {
            System.out.println("F");
        }

        System.out.println("G");
    }
}

// Execution Order :- A -> B -> C -> E -> F -> G
