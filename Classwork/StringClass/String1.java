package StringClass;

public class String1 {
    public static void main(String[] args) {
//        String s = args[0];
        String s1 = "MD"; // Way of creating string object like this is called string literals. This will store in String constant pool
        String s2 = "MD";

        String s3 = new String("MD"); // way of creating string object is called using new keyword.
        // This will store in heap memory and also origin is pointing to the scp

// s1 and s2 both have same content. So scp check and create one object with same reference address. like s1 --> abc123, s2 --> abc123
        System.out.println(s1 == s2);

//        here we get both s1 and s2 address in String constant pool
        System.out.println(System.identityHashCode(s1)); // 1791741888
        System.out.println(System.identityHashCode(s2)); // 1791741888

//       just bcz it created using new keyword. so it will store in different address in heap
        System.out.println(System.identityHashCode(s3)); // 1595428806

        String ss = new String("MM");
        String ss2 = new String("MM");

//        it will give false bcz both are in different address just bcz of new
        System.out.println(ss == ss2);

//        here it check content
        System.out.println(ss.equals(ss2));
    }
}
