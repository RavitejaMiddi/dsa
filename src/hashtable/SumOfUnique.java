package hashtable;

import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
    }
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry val: map.entrySet()){
            int dummy = Integer.parseInt(val.getValue().toString());
            if( dummy == 1){
                sum = sum + Integer.parseInt(val.getKey().toString());
            }
        }

        return  sum;
    }
}
