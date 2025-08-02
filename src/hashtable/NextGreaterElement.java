package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NextGreaterElement {
    public static void main(String[] args) {
        for (int i : nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{6,5,4,3,2,1,7})) {
            System.out.println(i);
        }


    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        Map<Integer,Integer> set = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            set.put(nums1[i],i);
            arr[i] = -1;
        }

        for(int i=0;i<nums2.length;i++){
            if(set.containsKey(nums2[i]) && i+1< nums2.length){
                for(int j=i+1;j<nums2.length;j++) {
                    if(nums2[j] > nums2[i] ){
                        int pos = set.get(nums2[i]);
                        arr[pos] = nums2[j];
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
