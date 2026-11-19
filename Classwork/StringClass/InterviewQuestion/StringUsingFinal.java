package StringClass.InterviewQuestion;

public class StringUsingFinal {
    public static void main(String[] args) {
        final String s = "Ja";

        String s2 = s + "va";

        String s3 ="Java";

        System.out.println(s2 == s3);
    }
}
