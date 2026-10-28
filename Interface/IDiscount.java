package Interface;

public interface IDiscount {
//    public abstract int calculateDiscount --> behind the seen it happen you don't need to add
    int calculateDiscount(int amount, int rate);

    public  abstract void calculateDiscountTax(int tax);
}
