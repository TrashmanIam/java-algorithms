package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) break; //Para terminar el proceso cuando se pasa de la mitad 0
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Para saltar las iteraciones innecesarios de valores iguales

            int l = i + 1, r = nums.length - 1; //Establecemos la ventana

            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if ( sum > 0 ){
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r])); //agregamos tripleta a la respuesta
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]){ //avanzamos l en caso de que haya valores duplicados
                        l++;
                    }
                }
            }

        }

        return res;

    }

    public static void main(String [] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

}
