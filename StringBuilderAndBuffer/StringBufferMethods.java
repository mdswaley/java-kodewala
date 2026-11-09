package StringBuilderAndBuffer;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        int res = sb.capacity(); // give initial capacity of StringBuffer

        System.out.println(res); // 16

        sb.ensureCapacity(20);

        System.out.println(sb.capacity()); // 34

//        why 34 ?
//        bcz ensureCapacity() follow formula to calculate the new capacity
//        NewCapacity = (OldCapacity * 2) + 2
//        Let's calculate: (16 * 2) + 2 = 34
    }
}
