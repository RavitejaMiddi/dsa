package twopointer;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        for(List<Integer> val : fourSum(new int[]{1,0,-1,0,-2,2},0)){
            System.out.println(val);
        }

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int temp1 = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int temp2 = nums[j];
                int first = j + 1;
                int last = nums.length-1;
                while(first<last){
                    Long sum = (long) (temp1 + temp2 + nums[first] + nums[last]);
                    if(sum == target) {
                        set.add(Arrays.asList(temp1, temp2, nums[first], nums[last]));
                        first++;
                    }
                    else if(sum < target) first++;
                    else last--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
