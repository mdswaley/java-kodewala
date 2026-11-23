package collection_framework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40));


        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 20){
                arr.remove(arr.get(i));
            }
        }

        System.out.println(arr);
    }
}

//Explanation: The enhanced for-loop uses an iterator internally. However, removing the
//second element makes the iterator's expected modification count different from the list's modification count.
//
//
//        In this particular example, the iterator reaches the end without another next()
//    call, so no exception is thrown. This is an implementation-dependent fail-fast behavior, not something to rely on.