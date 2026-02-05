package arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(nums[0], 1);

        for (int i = 1; i < nums.length; i++){
            if (hmap.containsKey(nums[i])) {
                return true;
            } else {
                hmap.put(nums[i], 1);
            }
        }

        return false;
    }

    public static void main(String [] args){
        int[] nums = {1, 2, 3, 3};
        System.out.println(hasDuplicate(nums));
    }

}
