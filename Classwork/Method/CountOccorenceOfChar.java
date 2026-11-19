package Method;

public class CountOccorenceOfChar {
    public static void main(String[] args) {
        String s = "Programming";

        System.out.println(countChar(s, 'm'));
    }

    static int countChar(String s, char ch){
        int count = 0;

        for(char c:s.toCharArray()){
            if(c == ch) count++;
        }

        return count;
    }
}
