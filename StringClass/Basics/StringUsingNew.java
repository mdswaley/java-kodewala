package StringClass.Basics;

public class StringUsingNew {
    public static void main(String[] args) {
        String s1 = "MD"; // always in scp --> any address like 124abs

        String s2 = new String("Swaley"); // one object in scp which is pointed by origin + one object is in heap pointed by s2

        System.out.println(s1 == s2); // always false bcz new keyword will allocate new address

        String s3 = new String("skill set");
        String s4 = new String("skill set");

        System.out.println(s3 == s4); // new keyword always create new object. So different address false

        System.out.println(s3.equals(s4)); // it will always check in String is content

//        String is case-sensitive so if you mention s3 = "skill set" and s4 = "skill seT" it will return false
    }
}
