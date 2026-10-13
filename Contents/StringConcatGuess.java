package Contents;

public class StringConcatGuess {
    public static void main(String[] args) {
        String str = "Hello";

        str.concat(" World!");

        System.out.println(str);

        //        Case 1
        String s1 = new String("ja") + new String("va");

        s1.intern(); // not in pool create it

        String s2 = "java";

        System.out.println(s1 == s2);

        //      Case 2
        String s = "Java";

        String s3 = new String("Java");

        s3.intern(); // already present return reference of that object

        System.out.println(s == s3);
    }
}
/*Java interview main ye String intern() ka question apko confuse kar sakta hai! kyun ki
2 case main almost code same hai but ek main true and or ek main false


chalia samaj te hai kyun*/
