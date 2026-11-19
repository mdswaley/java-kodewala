package StringClass.Basics;

public class ConvertFirstCharToUpperCase {
    public static void main(String[] args) {
        String s = "java Developer";

        String res = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        System.out.println(res);
    }
}
