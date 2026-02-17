package twoPointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().contentEquals(sb.reverse());
    }

    public static void main(String [] args){
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}
