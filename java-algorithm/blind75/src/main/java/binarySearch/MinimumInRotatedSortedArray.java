package binarySearch;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        System.out.println(findMin(nums));
    }
}
