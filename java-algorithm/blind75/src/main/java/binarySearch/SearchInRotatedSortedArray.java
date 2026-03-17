package binarySearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {

            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums [r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

        }

        return -1;
    }

    public static void main(String [] args){
        int[] nums = {-9, 12, 37, 102};
        int target = 102;

        System.out.println(search(nums,target));

    }
}
