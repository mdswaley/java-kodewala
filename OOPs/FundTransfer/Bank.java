package OOPs.FundTransfer;

public class Bank {
    private final String account_Holder_Name;
    private final String account_Number;
    private int balance;

    public Bank(String account_Holder_Name, String account_Number, int balance){
        this.account_Holder_Name = account_Holder_Name;
        this.account_Number = account_Number;
        this.balance = balance;
    }

    public void transferAmount(int amount){
        if (amount <= 0){
            System.out.println("Only positive amount can transfer..");
            return;
        }

        if (amount > balance){
            System.out.println("Insufficient balance to transfer..");
            return;
        }

        balance -= amount;
    }

    public int getAvailableBalance(){
        return balance;
    }

    public String getAccount_Holder_Name(){
        return account_Holder_Name;
    }

}
