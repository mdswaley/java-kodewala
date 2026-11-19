package BankingSystem;

public class BankAccount {
    private double balance;
    private int pin;
    protected double minimumBalance = 1000;
    
    public BankAccount(double balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount){
        System.out.println("\nDeposit Balance Called...");
        
        if(amount > 0){
            balance += amount;
        }

    }

    public void withdraw(double amount){
        System.out.println("\nWithdraw Balance called...");

        if(amount > balance){
            System.out.println("Insufficient balance...");
            return;
        }

        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    protected void calculateInterest(){
        System.out.println("Calculating interest...");
    }
}
