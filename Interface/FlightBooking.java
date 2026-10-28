package Interface;

public class FlightBooking implements IDiscount{
    @Override
    public int calculateDiscount(int amount, int rate) {
        return amount - (amount * rate) / 100;
    }

    @Override
    public void calculateDiscountTax(int tax) {
        System.out.println("Flight Booking calculate Tax");
    }
}
