package devsu;

/*
    The aim of this exercise is to check the presence of a number in an array.

    Specifications:
    The items are integers arranged in ascending order
    The array can contain up to 1 million items
    The array is never null
    Implement the method boolean A.exists(int[] ints, int k) so that it returns true if k belongs to ints, otherwise, the method should return false.

    Important note: Try to save CPU cycles if possible.

    Example:

    int[] ints = {-9, 14, 37, 102};
    A.exists(ints, 102) returns true
    A.exists(ints, 36) returns false
 */


import java.util.Arrays;

public class NumberInArray {

    public static boolean existUsingSimpleBS(int[] ints, int target){

        int l = 0;
        int r = ints.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (ints[m] == target) return true;

            if (ints[l] <= ints[m]) {
                if (target > ints[m] || target < ints[l]){
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (target < ints[m] || target > ints[r]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return false;
    }

    public static boolean existUsingJ2SE(int[] ints, int target){
        int binaryFound = Arrays.binarySearch(ints, target);
        if (binaryFound == -1) return false;
        return true;
    }

    public static void main(String [] args){
        int[] ints = {-9, 5, 14, 37, 62, 109};
        int target = 109;
        System.out.println(existUsingJ2SE(ints, target));
        System.out.println(existUsingSimpleBS(ints, target));
    }

}
