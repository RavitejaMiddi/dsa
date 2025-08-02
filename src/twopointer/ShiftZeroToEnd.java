package twopointer;

import java.util.Arrays;

public class ShiftZeroToEnd {
    public static void main(String[] args) {

        int[] nums = {0, 1,0,0, 0, 3, 2, 0, 0};
        int left = 0;
        int right = left+1;

        while (right < nums.length ){
            if(nums[left] != 0) {
                left++;
                right++;
                continue;
            }
            if(nums[right] != 0){
                int dum = nums[left];
                nums[left] = nums[right];
                nums[right] = dum;
                left++;
                right++;
            }else{
                right++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
