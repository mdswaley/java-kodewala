package ControlFlow.SwitchCase.BankingTransaction;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account = new Bank("Swaley", 10000);

        System.out.println("Welcome " + account.getName());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();

                account.deposit(depositAmount);

                System.out.println("Deposit successful");
                System.out.println("New Balance: " + account.getBalance());
                break;

            case 2:
                System.out.println("Enter withdraw amount : ");
                double amount = sc.nextDouble();

                if (amount > account.getBalance()){
                    System.out.println("Unsufficient balance.");
                }else{
                    account.withdraw(amount);
                    System.out.println("Withdrawal successful");
                    System.out.println("New Balance: " + account.getBalance());
                }
                break;
            case 3:
                System.out.println("Account Holder: " + account.getName());
                System.out.println("Balance: " + account.getBalance());
                break;

            case 4:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
