package StringClass.InterviewQuestion;

public class StringConcat2 {
    public static void main(String[] args) {

        String s = "Hello"; // scp

        String s2 = "world"; // scp

        String s3 = new String("World"); // heap + scp

        String res = s.concat(s3); // heap

        String res2 = s.concat("MD"); // MD will create in scp and HelloMD will be in heap ( scp + heap)

        String res3 = s.concat(s2); // heap

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }
}
