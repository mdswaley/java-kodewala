package Contents;

public class StringUnderstanding {
    public static void main(String[] args) {

//        Scp
        String str = "Hello";
        String str2 = "Hello";

//        World --> scp, str3 --> heap world
        String str3 = new String("World");

        System.out.println(str == str3);


    }
}
