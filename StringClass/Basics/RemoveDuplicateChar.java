package StringClass.Basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "programming";

        Set<Character> set = new HashSet<>();

        StringBuilder res = new StringBuilder();


        for (char ch: s.toCharArray()){
            if (!set.contains(ch)){
                res.append(ch);
            }
            set.add(ch);
        }

        System.out.println(res);
    }
}
