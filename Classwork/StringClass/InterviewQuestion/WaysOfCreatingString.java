package StringClass.InterviewQuestion;

public class WaysOfCreatingString {
    public static void main(String[] args) {

        String s = "Hello"; // scp

        String s2 = new String("Hello"); // heap + scp

        System.out.println(s == s2.intern());

    }
}
