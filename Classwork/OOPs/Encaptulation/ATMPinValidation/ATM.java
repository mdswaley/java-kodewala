package OOPs.Encaptulation.ATMPinValidation;

import javax.naming.AuthenticationException;

public class ATM {
    private int pin;
    private double balance;

    ATM(int pin, double balance){
        this.pin = pin;
        this.balance = balance;
    }

    public void changePin(int pin, int newPin) throws AuthenticationException {
        if (this.pin == pin){
            this.pin = newPin;
        }else{
            throw new AuthenticationException("Your current pin is incorrect..");
        }
    }


    public void withdraw(int pin, double amount) throws AuthenticationException {
        if (this.pin != pin){
            throw new AuthenticationException("Incorrect pin");
        }
        if (amount > 0 && amount <= this.balance){
            this.balance -= amount;
            return;
        }

        throw new RuntimeException("Insufficient balance");
    }

    public double getBalance(){
        return balance;
    }
}
