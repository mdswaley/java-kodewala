package collection_framework.List;

import java.util.ArrayList;

public class ArrayListWithNull {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Java");
        arr.add(null);
        arr.add("Python");
        arr.add(null);

        System.out.println(arr.size());
        System.out.println(arr);
    }
}
