package OOPs.Abstraction.ATMSystem;

public class ImplementATM {
    public static void main(String[] args) {
        ATM atm = new ATM(4356, 5000);

        atm.withdraw(4356, 3000);
    }
}
