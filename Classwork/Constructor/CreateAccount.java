package Constructor;

public class CreateAccount {
    public static void main(String[] args) {
        Accounts acc1 = new Accounts(); // default constructor was called here

        Accounts acc2 = new Accounts(1, "MD", 649993.32);

        System.out.println("Account info : ID : "+acc2.id+" Name : "+ acc1.name+" Balance: "+acc2.balance);
    }
}
