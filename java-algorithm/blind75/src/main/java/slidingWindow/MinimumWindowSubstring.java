package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character, Integer> counTMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (Character c : t.toCharArray()){
            counTMap.put(c, counTMap.getOrDefault(c, 0) + 1);
        }

        int have = 0, need = counTMap.size();
        int [] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (counTMap.containsKey(c) && counTMap.get(c).equals(windowMap.get(c))){
                have++;
            }

            while(have == need){
                if((r - l + 1) < resLen){
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s.charAt(l);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (counTMap.containsKey(leftChar) && windowMap.get(leftChar) < counTMap.get(leftChar)){
                    have--;
                }
                l++;
            }

        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

    }

    public static void main(String [] args){
        String s = "OUZODYXAZV", t = "XYZ";
        System.out.println(minWindow(s, t));
    }

}
