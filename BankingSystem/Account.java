package BankingSystem;

public class Account {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1200, 4352);
        Transaction t1 = new Transaction();

        a1.deposit(2300);
        System.out.println(a1.getBalance());
        
        t1.printTransaction();

        a1.withdraw(530);
        System.out.println(a1.getBalance());

        t1.printTransaction();

        SavingsAccount s1 = new SavingsAccount(2000, 5312);
        s1.checkBalanceRule();

        t1.printTransaction();
    }
}
