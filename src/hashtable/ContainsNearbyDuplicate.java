package hashtable;

import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1},1));
    }
    public  static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }else{
                 var diff = Math.abs(hm.get(nums[i]) - i);
                 if(diff <= k){
                     return true;
                 }
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}
