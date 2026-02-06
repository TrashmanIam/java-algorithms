package arraysAndHashing;

import java.util.*;

public class EncodeDecodeStrings {

    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : strs){
            int size = word.length();
            char asciiSize = (char) size;
            stringBuilder.append(asciiSize).append(word);
        }
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        List<String> decodedList = new ArrayList<>();

        while(stringBuilder.length() > 0){
            int length = stringBuilder.substring(0, 1).charAt(0);
            stringBuilder.deleteCharAt(0);
            String word = stringBuilder.substring(0, length);
            stringBuilder.delete(0, length);
            decodedList.add(word);
        }

        return decodedList;
    }

    public static void main(String [] args){
        String[] strs = {"Hello","World"};
        System.out.println(decode(encode(Arrays.asList(strs))));
    }
}
