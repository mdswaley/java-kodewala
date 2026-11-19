package OOPs.Encaptulation.FundTransfer;

public class ImplementBank {
    public static void main(String[] args) {
        Bank bank = new Bank("Raaj", "34987397984", 2000);

        bank.transferAmount(400);

        System.out.println("Get available balance for "+bank.getAccount_Holder_Name()+" is : "+bank.getAvailableBalance());

        bank.transferAmount(18300);

        System.out.println(bank.getAvailableBalance());

//        bank.transferAmount(1700);

    }
}
