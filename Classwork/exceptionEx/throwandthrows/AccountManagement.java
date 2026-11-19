package exceptionEx.throwandthrows;

public class AccountManagement {

    public void openAccount(String name, String accNo){
        activeAccount(accNo);
    }

    public void activeAccount(String accNo){
        System.out.println("Start active Account..");

        try {
            checkAccountStatus(null);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End active Account..");
    }

    public boolean checkAccountStatus(String accNo) throws Exception{
        try {
            accNo.startsWith("SBI");
        } catch (NullPointerException e){
            throw new Exception("Account Number is not starting with SBI");
        }

        return false;
    }
}
