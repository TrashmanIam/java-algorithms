package arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (hmap.containsKey(diff)){
                return new int[] {hmap.get(diff), i};
            }

            hmap.put(num, i);
        }

        return new int[] {};

    }

    public static void main(String [] args){
        int[] nums = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
