package StringBuilderAndBuffer;

public class StringBuilderForLoop {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i=1;i<=10;i++){
            sb.append("Count : "+i);
        }

        System.out.println(sb);
    }
}
