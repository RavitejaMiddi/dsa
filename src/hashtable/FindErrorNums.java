package hashtable;

import java.util.HashSet;
import java.util.Set;

public class FindErrorNums {
    public static void main(String[] args) {
    for(int num:findErrorNums(new int[]{1,2,2})){
        System.out.println(num);
    }
    }
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else {
                arr[count++] = nums[i];
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i))
                arr[count] = i;
        }
        return arr;
    }
}
