package Contents;

public class StringIntern2 {
    public static void main(String[] args) {

//        Case 2
        String s = "Java"; // scp

        String s3 = new String("Java"); // scp

        String s4 = s3.intern(); // already present return reference of that object

        System.out.println(s == s4);
    }
}
