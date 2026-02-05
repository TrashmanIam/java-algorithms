package arraysAndHashing;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> hmap = new HashMap<>();

        for(String word : strs){

            int[] count = new int[26];
            for (char c : word.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            if (hmap.containsKey(key)){
                hmap.get(key).add(word);
            } else {
                hmap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }

        return new ArrayList<>(hmap.values());
    }

    public static void main(String [] args){
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }
}
