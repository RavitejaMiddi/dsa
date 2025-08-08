package twopointer;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

        System.out.println(threeSumClosest(new int[]{0,0,0},1));


    }
    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int first = i+1;
            int last = nums.length-1;
            while(first<last){
                int currSum = temp + nums[first]+nums[last];
                int currDiff = target - currSum;
                if(currDiff == 0) return currSum;
                if(Math.abs(currDiff) < Math.abs(minDiff)) {
                    closestSum = currSum;
                    minDiff = currDiff;
                }
                if(currSum < target) first++;
                else last--;
            }
        }
        return closestSum;
    }
}
