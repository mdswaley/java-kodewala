package collection_framework.List;

import java.util.ArrayList;

public class RemovingAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1); // always remove by index. Not the element whose value is 1.

        System.out.println(list); // [10, 30]
    }
}
