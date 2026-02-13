package arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        int res = 0;

        Set<Integer>  numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        for (Integer num : numSet){
            int streak = 1;
            if (!numSet.contains(num-1)){
                int currentNum = num;
                while (numSet.contains(currentNum + 1)){
                    currentNum++;
                    streak++;
                }
            }

            res = Math.max(res,  streak);
        }

        return res;
    }

    public static void main (String [] args){
        int [] nums = {2,20,4,10,3,4,5};
        System.out.println(longestConsecutive(nums));
    }
}
