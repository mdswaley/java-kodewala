package collection_framework.List;

import java.util.ArrayList;

public class RemovePlace {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Bangalore");
        arr.add("Mysore");
        arr.add("Hyd");
        arr.add("CH");
        arr.add("Ahm");
        arr.add("DL");
        arr.add("Mumbai");

        arr.remove(3); // remove 3rd index value. Then shift all the rest of element towards left.

        arr.add(3, "GGN"); // adding element in 3rd index. Then shift all the rest of element towards right.

        System.out.println(arr);
    }
}
