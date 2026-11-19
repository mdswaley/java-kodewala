package StringClass.Basics;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar {
    public static void main(String[] args) {
        String s = "programming";
        System.out.println("Find first repeating character ---> "+findFirst(s));
    }

    private static char findFirst(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()){
            if (map.get(ch) > 1){
                return ch;
            }
        }

        return '-';
    }
}
