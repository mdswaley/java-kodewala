package collection_framework.List;

import java.util.ArrayList;

public class ContentArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Raaj");
        arr.add("Hardik");
        arr.add("Ajay");
        arr.add("Dinesh");
        arr.add("Sapna");
        arr.add("Vivak");
        arr.add("Raaj");
        arr.add("Hardik");
        arr.add("Ajay");
        arr.add("Dinesh");
        arr.add("Sapna");
        arr.add("Vivak");

        arr.get(3); // TC :- O(1)

        arr.add(3, "Rohit"); // TC:- O(n)

        System.out.println(arr);
    }
}
