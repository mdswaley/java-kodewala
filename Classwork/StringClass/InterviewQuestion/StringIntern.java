package StringClass.InterviewQuestion;

public class StringIntern {
    public static void main(String[] args) {
        String s1 = "Hello"; // scp
        String s2 = " World"; // scp

        String s3 = s1 + s2; // created in heap (new StringBuilder)

        String s4 = "Hello World"; // in scp

        System.out.println(s4 == s3.intern());

//        so previously s4 == s3 --> false . Bcz s4 is in scp and s3 is in heap. so different address
//        Now after using intern() s4 == s3.intern() --> true . Bcz s4 is in scp and s3 is now referring same s4 object bcz of same content.
    }
}



















// intern() --> use if object is
// in scp then s3 start referring that object if not exist then create copy
// then start referring that