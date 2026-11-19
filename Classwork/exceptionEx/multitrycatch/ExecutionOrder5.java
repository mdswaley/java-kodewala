package exceptionEx.multitrycatch;

public class ExecutionOrder5 {
    public static void main(String[] args) {
        try{
            System.out.println("A");
        }
        catch (Exception e){
            System.out.println("B");
        }
        finally {
            System.out.println("C");

            try{
                int x = 10 / 0;
            } catch (ArithmeticException e){
                System.out.println("D");
            }

            System.out.println("E");
        }

        System.out.println("F");
    }
}

// Execution Order :- A -> C -> D -> E -> F
