package StringClass.Basics;

import java.util.HashMap;
import java.util.Map;

public class CountCharInString {
    public static void main(String[] args) {
        String s = "skill set";

        System.out.println(countChar(s));

    }
    private static Map<Character, Integer> countChar(String s){
        Map<Character, Integer> res = new HashMap<>();

        for (char ch : s.toCharArray()){
            if (ch == ' '){
                continue;
            }

            res.put(ch, res.getOrDefault(ch, 0) + 1);
        }

        return res;
    }
}
