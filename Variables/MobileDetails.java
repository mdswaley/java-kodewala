package Variables;

public class MobileDetails {
    static int batteryMH = 5000;
    String companyName;
    int price;
    static int count;

    MobileDetails(String companyName, int price){
        this.companyName = companyName;
        this.price = price;
        count++;
    }


    public static void main(String[] args) {
        MobileDetails m1 = new MobileDetails("Samsung", 47000);
        MobileDetails m2 = new MobileDetails("Vivo", 23000);

        int countSale = MobileDetails.count;

        System.out.println("Mobile 1 : " + m1.companyName);
        System.out.println("Price    : " + m1.price);

        System.out.println("Mobile 2 : " + m2.companyName);
        System.out.println("Price    : " + m2.price);

        System.out.println("Battery  : " + MobileDetails.batteryMH + " mAh");
        System.out.println("Total product sale : " + countSale);
    }
}
