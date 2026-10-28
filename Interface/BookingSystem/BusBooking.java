package Interface.BookingSystem;

public class BusBooking implements IDiscount{
    @Override
    public int calculateDiscount(int amount, int rate) {
        return amount;
    }

    @Override
    public void calculateDiscountTax(int tax) {
        System.out.println("Calculate Tax in Bus booking");
    }
}
