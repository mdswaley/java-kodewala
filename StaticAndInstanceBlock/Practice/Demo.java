package StaticAndInstanceBlock.Practice;

public class Demo {
    static {
        System.out.println("S1");
    }

    {
        System.out.println("I1");
    }

    static {
        System.out.println("S2");
    }

    {
        System.out.println("I2");
    }

    Demo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Demo(); // s1 --> s2 --> I1 --> I2 --> Constructor
    }
}


