package arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> hmap = new HashMap<>();

        for (char c : s.toCharArray()){
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()){
            if (!hmap.containsKey(c)) {
                return false;
            }

            int count = hmap.get(c);
            if (count == 1){
                hmap.remove(c);
            } else {
                hmap.put(c, count-1);
            }
        }

        return hmap.isEmpty();
    }

    public static void main(String [] args){
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s, t));
    }
}
