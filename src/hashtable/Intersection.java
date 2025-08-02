package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        for (int i : intersection(new int[]{1,2,2,1}, new int[]{2,2})) {
            System.out.println(i);
        }


    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr =  new HashSet<>();

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]) ){
                arr.add(nums2[i]);
            }
        }
        int[] result = new int[arr.size()];
        int i=0;
        for(int val:arr){
            result[i] = val;
            i++;
        }
        return result;
    }
}
