package twopointer;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        int[] arr = {0, -1, 2, -3, 1};
//        int len = arr.length -1;
//        int fp = 0;
//        int left = fp +1;
//        int right = len;
//        List<int[]> threeSumArr = new ArrayList<int[]>();
//        Arrays.sort(arr);
//        for(int i=0;i< len ;i++) {
//            int sum = arr[fp] + arr[left] + arr[right];
//            if (left <= right) {
//                if (sum == 0) {
//                    threeSumArr.add(new int[]{arr[fp], arr[left], arr[right]});
//                } else if (sum > 0) {
//                    right--;
//                } else if (sum < 0) {
//                    left++;
//                }
//            }
//        }

        for(List<Integer> val:threeSum(new int[]{-1,0,1,2,-1,-4})){
            System.out.println(val.toString());
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int first = i+1;
            int last = nums.length-1;
            while (first<last){
                int sum = temp + nums[first] + nums[last];
                if(sum == 0){
                    set.add(Arrays.asList(temp,nums[first],nums[last]));
                    first++;
                }else if(sum < 0)
                    first++;
                else last--;
            }
        }
        return new ArrayList<>(set);
    }
}
