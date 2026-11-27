package collection_framework.List;

import java.util.ArrayList;

public class SetMethodInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.set(1, "Java"); // set(index, ele) is different from add(index, ele).
        // Set() set the new value to the particular index
//        but add() insert the value in the index then rest of upcoming element need to shift right

        System.out.println(list);
    }
}
