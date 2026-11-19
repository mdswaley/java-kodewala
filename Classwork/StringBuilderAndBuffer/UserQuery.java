package StringBuilderAndBuffer;

public class UserQuery {
    public static void main(String[] args) {
        GenerateQuery generateQuery = new GenerateQuery();
        StringBuilder sb = generateQuery.generateQuery(20000, null);
        StringBuilder sb2 = generateQuery.generateQuery(0, "MD123");
        StringBuilder sb3 = generateQuery.generateQuery(0, null);

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
