package Method;

public class FundTransfer {
    public static void main(String[] args) {
        boolean res = FundTransfer.doTransaction(100, "w4953894792", "4379u943878");

        System.out.println("Is amount transfer successfully ? "+res);
    }

    static boolean doTransaction(int amount, String senderAN, String receiverAN){
        System.out.println("Input amount is "+amount+" transfer amount to "+senderAN+" receive amount by "+receiverAN);
        
        return true;
    }
}
