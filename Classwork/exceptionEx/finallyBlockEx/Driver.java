package exceptionEx.finallyBlockEx;

public class Driver {
    public static void main(String[] args) {
        Driver driver = new Driver();
        int res = driver.calDiscount(100, 10);

        System.out.println(res);
    }

    private int calDiscount(int amount, int dis){
        int finalAmt = 0;

        try{
            finalAmt = amount - (amount * dis / 100);

            return finalAmt; // if we add return here then out put is same as result give

        } catch (Exception e) {
            System.out.println("some exception...");
            e.printStackTrace();
        } finally {
             finalAmt = 110;
            return finalAmt; // but if i add here then return value will override which is 90 become 110
        }

//        return finalAmt;
    }
}

// The finally block always executes before the method actually completes, even if there is a return
// statement inside the try or catch block.
