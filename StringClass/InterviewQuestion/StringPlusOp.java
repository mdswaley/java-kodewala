package StringClass.InterviewQuestion;

public class StringPlusOp {
    public static void main(String[] args) {
        String s = "This is " + "my class " + " 12th";

//        here content are constant that cannot be changed
//        String s = "This is my class 12th"; compiler convert that string to like this format and store it into scp. bcz of string literal

        System.out.println(s); // there is only 1 object created in scp

        String s2 =  "Hello"; // scp
        String s3 = "World"; // scp

//        compiler would not involve here bcz s2 and s3 are not constant they might be change it later
        String s4 = s2 + s3; // + operator internally uses new StringBuilder(). so it will create in heap bcz of new

        System.out.println(s4);
    }
}
