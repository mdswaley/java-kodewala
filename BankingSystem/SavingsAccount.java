package BankingSystem;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance, int pin) {
        super(balance, pin);
    }

    public void checkBalanceRule(){
        if(minimumBalance >= 1000){
            System.out.println("Minimum balance maintained...");
        }

        calculateInterest();
    }
}
