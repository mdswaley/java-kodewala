package collection_framework.List;

import java.util.ArrayList;

public class DefaultSizeArrayList {
    public static void main(String[] args) {
//        Initial capacity of ArrayList is 10
//        increase after adding 11th element. will be 50% mean 15 capacity
        ArrayList<String> arr = new ArrayList<>();

        arr.add("MD");
        arr.add("Raaj");
        arr.add("Hari");
        arr.add("Subham");
        arr.add("Prince");

        arr.add("MD");
        arr.add("Raaj");
        arr.add("Hari");
        arr.add("Subham");
        arr.add("Prince");
        arr.add("jdfhk");

        System.out.println(arr.size());

    }
}
// At the time of debugging add this in evaluate expression: arr.elementData.length