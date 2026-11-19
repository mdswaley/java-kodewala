package ControlFlow.SwitchCase.BankingTransaction;

public class Bank {
    private String name;
    private double balance;

    public Bank(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
