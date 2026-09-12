package DataTypes;

public class BooleanExp {
    static boolean isValid = false;
    public static void main(String[] args) {

        short a = 5;

        System.out.println(a);

        System.out.println("Default value for boolean is : "+isValid);

        int age = 17;

        if(age > 18){
            isValid = true;
        }

        System.out.println(isValid);
        
    }
}
