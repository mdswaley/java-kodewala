package collection_framework.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ContentArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Raaj", "Hardik", "Ajay", "Dinesh", "Sapna", "Vivak"));

        arr.remove("Dinesh");
        System.out.println(arr);

    }
}
