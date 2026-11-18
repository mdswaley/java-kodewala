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

            return finalAmt;

        } catch (Exception e) {
            System.out.println("some exception...");
            e.printStackTrace();
        } finally {
             finalAmt = 110;

        }

        return finalAmt;
    }
}
