package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Intersect {
    static HashMap<Integer,Integer> integerHashSet = new HashMap<>();
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
            ArrayList intersectArr = new ArrayList();
            integerHashSet(nums2);
            for(int val: nums1){
                if(findOccu(val))
                    intersectArr.add(val);
            }
           int[] arr =new int[intersectArr.size()];
            for(int i=0; i<arr.length;i++){
                arr[i] = (int) intersectArr.get(i);
            }
            return arr;
        }

        private static boolean findOccu(int num){
        if(integerHashSet.containsKey(num) && integerHashSet.get(num) > 0){
            integerHashSet.put(num,integerHashSet.get(num)-1);
            return true;
        }
        return false;

        }

        private static void integerHashSet(int[] arr){
            for(int val:arr)
               integerHashSet.put(val,integerHashSet.getOrDefault(val,0)+1);
        }
}
