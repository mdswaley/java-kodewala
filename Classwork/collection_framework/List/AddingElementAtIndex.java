package collection_framework.List;

import java.util.ArrayList;

public class AddingElementAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 100);

        System.out.println(list); // [10, 100, 20, 30]
    }
}

// Why?
// add(index, element) inserts the element at the specified position and shifts subsequent elements to the right.
