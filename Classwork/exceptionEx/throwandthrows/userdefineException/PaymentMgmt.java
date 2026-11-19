package exceptionEx.throwandthrows.userdefineException;

public class PaymentMgmt {
    public void doPayment(String accountNo, int amount){
        try {
            checkBalance(accountNo, amount);
        } catch (InsufficientException e){ // if we catch FundTransferException here
//            instead of InsufficientException. doPayment throw to the caller method. which is Main method and they need to handle it
            throw new FundTransferException("you don't have enough balance " +
                    "OR in case you have open the account recently. " +
                    "Please wait for 24hrs.");
        }
    }

    private boolean checkBalance(String accountNo, int amount) throws InsufficientException{
        boolean checkBalanceStatus = false;
        int balance = 100;

        if (amount > balance){
            throw new InsufficientException(accountNo +" does not have enough balance and current balance is : "+balance);
        } else {
            checkBalanceStatus = true;
        }

        return checkBalanceStatus;
    }
}
