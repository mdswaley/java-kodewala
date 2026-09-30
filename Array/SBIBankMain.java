package Array;

public class SBIBankMain {
    public static void main(String[] args) {
        SBIBank cus1 = new SBIBank("Swaley", 1200, "98479332");
        SBIBank cus2 = new SBIBank("Raj", 2400, "8345370213");
        SBIBank cus3 = new SBIBank("Siri", 880, "239279342");
        SBIBank cus4 = new SBIBank("Priya", 6399, "284732972");
        SBIBank cus5 = new SBIBank("Harsh", 1992, "892493272");
        SBIBank cus6 = new SBIBank("Neha", 2000, "0293489242");


        SBIBank[] customers = {cus1, cus2, cus3, cus4, cus5, cus6};

        for (int i=0;i<customers.length;i++){

            if(customers[i].balance >= 2000){
                System.out.println("Customer "+customers[i].customerName+" having balance : "+customers[i].balance);
            }

        }


    }
}
