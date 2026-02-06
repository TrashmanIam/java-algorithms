package arraysAndHashing;

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for (int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                res[index++] = n;
                if (index == k){
                    return res;
                }
            }
        }

        return res;

    }

    public static void main(String [] args){
        int[] nums = {1,2,7,5,6,4,7,1,2,3,6,4,5,7,1,2,3,2};
        int k = 4;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }

}
