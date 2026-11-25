package collection_framework.List.TrickyCase;

import java.util.ArrayList;

public class RemoveEle {
    public static void main(String[] args) {
//        1. Two overloaded remove() methods
        // Removes element based on index
//              public E remove(int index);

        // Removes element based on value
//              public boolean remove(Object o);

//         Case 1: ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1); // Here, 1 is a primitive int. Therefore, it removes the element at index 1, which is 20.

        System.out.println(list);
    }
}
