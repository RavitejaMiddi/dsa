package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TopKFrequent {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
        }
        //solve
       return arr;

    }
}
