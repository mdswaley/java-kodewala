package StringClass.InterviewQuestion;

public class StringConcat2 {
    public static void main(String[] args) {

        String s = "Hello"; // scp

        String s2 = "world"; // scp

        String s3 = new String("World"); // heap + scp

        s.concat(s3); // heap

    }
}
