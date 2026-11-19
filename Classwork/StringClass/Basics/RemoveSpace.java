package StringClass.Basics;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "   java Programming  ";
        System.out.println(removeSp(s));

//        for removing white space
        System.out.println(s.trim());

        String str = s.replace(" ", ""); // if there is no space to replace. Then str will point to s in scp.
        System.out.println(str);
    }

    private static String removeSp(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch :  s.toCharArray()){
            if (ch == ' ') continue;

            sb.append(ch);
        }

        return sb.toString();
    }
}
