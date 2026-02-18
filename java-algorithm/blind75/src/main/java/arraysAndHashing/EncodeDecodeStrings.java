package arraysAndHashing;

import java.util.*;

public class EncodeDecodeStrings {

    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : strs){
            int size = word.length();
            char asciiSize = (char) size;
            //Se establece la longitud de la palabra a codificar en char y se adiciona junto con la palabra al StringBuilder
            stringBuilder.append(asciiSize).append(word);
        }
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        List<String> decodedList = new ArrayList<>();

        while(stringBuilder.length() > 0){
            //Se decodifica substrayendo el primer caracter como char, convirtiendolo en int y después realizando un subString
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
