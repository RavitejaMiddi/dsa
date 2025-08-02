package twopointer;

public class MaxContainer {
    public static void main(String[] args) {

        int[] heights = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;
        while( left < right){
            int diff = right-left;
            int val = Math.min(heights[left], heights[right]) * diff;
            if(val > maxArea){
                maxArea = val;
            }
            if(heights[left] > heights[right]){
                right--;
            } else if (heights[right] > heights[left]) {
                left++;
            } else if (heights[left] == heights[right]) {
                right--;
            }
        }
        System.out.println(maxArea);

    }
}
