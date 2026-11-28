package collection_framework.List;

import java.util.ArrayList;

public class ForEachArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer num : list) {
            if (num == 10) {
                list.remove(num);
            }
        }



        System.out.println(list);
    }
}
