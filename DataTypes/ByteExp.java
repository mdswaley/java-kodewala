package DataTypes;

public class ByteExp {
    public static void main(String[] args) {
        byte a = -100;

        if(a < -128 || a > 127){
            System.out.println("a is out of range");
            return;
        }

        System.out.println("a value is : "+a);
    }
}
