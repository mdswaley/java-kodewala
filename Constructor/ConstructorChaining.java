package Constructor;

public class ConstructorChaining {
    int a;
    int b;
    int c;

    ConstructorChaining(){
        this(10, 20);
        System.out.println("Default constructor call...");
    }

    ConstructorChaining(int a, int b){
        this(10, 20, 30);
        this.a = a;
        this.b = b;

        System.out.println("Sum of two number is : "+(a + b));
    }

    ConstructorChaining(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println("Sum of three number is : "+(a + b + c));
    }


    public static void main(String[] args) {
        ConstructorChaining c1 = new ConstructorChaining();
    }

}
