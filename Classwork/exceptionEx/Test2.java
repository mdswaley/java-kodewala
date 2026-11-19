package exceptionEx;

public class Test2 {
    public static void main(String[] args) {
        Account2 account2 = new Account2();
        account2.doActivateAcc(null);
    }
}

class Account2{
    void doActivateAcc(String accNo){
        System.out.println("Account2.doActivateAcc Start");

        validateAccNo(accNo);

        System.out.println("Account2.doActivateAcc End");
    }

    boolean validateAccNo(String accNo){
        System.out.println("Account2.validateAccNo Start");

        if (accNo.startsWith("SBI")){ // NullPointerException occurs here
            return true;
        }

        System.out.println("Account2.validateAccNo End");

        return false;

    }
}
