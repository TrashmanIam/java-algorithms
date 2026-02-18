package arraysAndHashing;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        //Se realiza primero las multiplicaciones de izquierda a derecha
        for (int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }

        //Se realizan las demas multiplicaciones de derecha a izquierda
        int postfix = 1;
        for (int j = n - 1; j >= 0; j--) {
            res[j] *= postfix;
            postfix *= nums[j];
        }

        return res;
    }

    public static void main(String [] args){
        int[] nums = {1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
