package arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        int res = 0;

        Set<Integer>  numSet = new HashSet<>();
        //Se crea y se llena el HashSet para evitar numeros duplicados
        for(int num : nums){
            numSet.add(num);
        }

        //Se recorren los numeros sin duplicidad
        for (Integer num : numSet){
            int streak = 1;
            //se revisa que no exista un numero inferior dnetro del Set
            if (!numSet.contains(num-1)){
                int currentNum = num;
                //Mientras exista un numero superior en uno, se incrementa el valor actual y la racha
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
