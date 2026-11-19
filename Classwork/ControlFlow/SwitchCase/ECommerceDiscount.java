package ControlFlow.SwitchCase;

public class ECommerceDiscount {
    public static void main(String[] args) {
        double amount = Double.parseDouble(args[0]);

        String cusType = args[1];

        int min = 1000;

        double total_dis = 0;

        if (amount >= 1000){
            total_dis = getDiscount(amount, cusType);
        }else{
            System.out.println("Customer have less than minimum discount amount "+min+" So no discount");
        }

        double totalAmountToPay = amount - total_dis;

        System.out.println("Customer Type : "+cusType);
        System.out.println("Amount : "+amount);
        System.out.println("Get discount : "+total_dis);
        System.out.println("Final Amount to pay  : "+totalAmountToPay);
    }

    private static double getDiscount(double amount, String cusType){
        double dis = 0;

        switch (cusType){
            case "Gold":
                dis = amount * 20 / 100;
                break;
            case "Silver":
                dis = amount * 15 / 100;
                break;
            case "Regular":
                dis = amount * 5 / 100;
                break;
            default:
                System.out.println("Not a customer type");
                break;
        }

        if (dis > 2500){
            dis = 2500;
        }

        return dis;
    }
}
