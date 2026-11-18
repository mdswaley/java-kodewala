package exceptionEx.multitrycatch;

public class ExecutionOrder {
    public static void main(String[] args) {
        try{
            System.out.println("A");

            try {
                System.out.println("B");

                int res = 10 / 0;

                System.out.println("C");
            }
            catch (ArithmeticException e){
                System.out.println("D");
            }

            System.out.println("E");
        } catch (Exception e){
            System.out.println("F");
        }

        System.out.println("G");
    }
}

// Execution Order :- A -> B -> D -> E -> G
