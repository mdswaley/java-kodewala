package OOPs.Encaptulation;

public class Payment {
    private int balance;

    public Payment(int balance){
        this.balance = balance;
    }

//    Getter
    public int getBalance() {
        return balance;
    }

    public int doDebit(int amount){
        if (amount > this.balance){
            throw new RuntimeException("Insufficient balance");
        }

        this.balance -= amount;

        return balance;
    }

//    Setter
    public void setBalance(int balance) {
        if (balance > 0){
            this.balance += balance;
        }
    }
}
