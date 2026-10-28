package Interface;

class Main {
    public static void main(String[] args) {
        IDiscount iDiscount = new FlightBooking();

        int discount = iDiscount.calculateDiscount(7000, 20);

        System.out.println(discount);
    }
}
