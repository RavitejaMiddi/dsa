package hashtable;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{2,1,1,2,1,3,3,3,1,3,1,3,2}));
    }
    public  static int findShortestSubArray(int[] nums) {
    int shortestSub = 0;
    //find out degree of array - degree is the element that appears most times in an array
        int degree =0;
        int degreeElement = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            if(hm.get(nums[i]) > degree) {
                degree = hm.get(nums[i]);
                degreeElement = nums[i];
            }
        }

      for(int i=0;i<nums.length && degree > 0;i++){
          if(degreeElement == nums[i]){
              shortestSub = shortestSub + 1;
              degree--;
          } else if (shortestSub > 0) {
              shortestSub = shortestSub + 1;
          }
      }

    return shortestSub;
    }
}
