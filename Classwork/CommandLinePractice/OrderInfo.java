package CommandLinePractice;

public class OrderInfo {
    // wap order ID, product name, placed by, delivery address info from command line args

    public static void main(String[] args) {
        int orderId = Integer.parseInt(args[0]);
        String productName = args[1];
        String placedBy = args[2];
        String deliveryAdd = args[3];

        System.out.println(orderId);
        System.out.println(productName);
        System.out.println(placedBy);
        System.out.println(deliveryAdd);

    }
}
