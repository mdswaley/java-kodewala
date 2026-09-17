package Method;

public class TransactionInfo {
    public static void main(String[] args) {
        TransactionInfo.transaction(120, 500, 230);
    }

    static void transaction(int amount, int senderBalance, int receiverBalance){
        if(amount > 0 && amount < senderBalance){
            senderBalance -= amount;
            receiverBalance += amount;
        }

        System.out.println("Sender Available Balance : "+senderBalance);
        System.out.println("Receiver Available Balance : "+receiverBalance);
    }
}
