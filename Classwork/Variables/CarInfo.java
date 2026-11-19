package Variables;

public class CarInfo {
    static int wheel = 4;
    String color;

    public static void main(String[] args) {
        CarInfo c = new CarInfo();
        c.color = "Red";

        CarInfo c2 = new CarInfo();
        c2.color = "Blue";

        System.out.println("Car have "+CarInfo.wheel+" wheel");
        System.out.println("Car color is : "+c.color);

        System.out.println("Another Car color is : "+c2.color);
    }   
}
