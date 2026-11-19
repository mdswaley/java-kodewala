package StringClass.Basics;

public class FindLengthOfString {
    public static void main(String[] args) {
        String s = "Hello World!";

        System.out.println(findLength(s));
    }

    private static int findLength(String s){
        int count = 0;

        for (char ch : s.toCharArray()){
            count++;
        }

        return count;
    }
}
