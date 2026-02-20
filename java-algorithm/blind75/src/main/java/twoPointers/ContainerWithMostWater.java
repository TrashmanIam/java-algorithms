package twoPointers;

public class ContainerWithMostWater {

    public static int maxArea(int[] heights) {
        int res = 0, l = 0, r = heights.length - 1;
        while (l < r){
            int area = (r - l) * Math.min(heights[l], heights[r]);
            res = Math.max(res, area);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main(String [] args){
        int[] heightsArray = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heightsArray));
    }

}
