package BankingSystem;

public class Account {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1200, 4352);

        a1.deposit(2300);
        System.out.println(a1.getBalance());

        a1.withdraw(530);
        System.out.println(a1.getBalance());
    }
}
