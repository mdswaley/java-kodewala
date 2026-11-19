package StringClass.Basics;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.reverse());
    }
}
