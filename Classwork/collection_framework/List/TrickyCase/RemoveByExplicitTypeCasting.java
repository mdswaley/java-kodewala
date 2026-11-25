package collection_framework.List.TrickyCase;

import java.util.ArrayList;

public class RemoveByExplicitTypeCasting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        list.remove(Integer.valueOf(20)); // Here, Integer.valueOf(20) creates an Integer object,
        // so Java selects remove(Object o).

        System.out.println(list);// OP:- [10, 30, 20]
//        why not remove all the occurrence of 20 ?
//        bcz, remove(Object o) removes only the first occurrence of the matching value, not all occurrences.
    }
}
