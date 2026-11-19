package OOPs.Abstraction.ATMSystem;

public class ATM {
    private double balance;
    private final int pin;

    ATM(int pin, double balance){
        this.pin = pin;
        this.balance =  balance;
    }

    private boolean validatePin(int pin){
        return this.pin == pin;
    }

    private void updateBalance(double amount){
        balance -= amount;
    }

    public void withdraw(int pin, double amount){
        if (validatePin(pin) && amount > 0 && amount <= balance){
            updateBalance(amount);
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Transaction failed");
        }
    }
}
