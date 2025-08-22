package heaps;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {


    public static void main(String[] args) {
            for(int val :topKFrequentAppr2(new int[]{1,2},2)){
                System.out.println(val);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        //holds key == integer  and its value is integers frequency
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        PriorityQueue<Object> queue = new PriorityQueue(k);
        for(int i=0;i<nums.length;i++){
            treeMap.put(nums[i],treeMap.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry val: treeMap.entrySet()){
            queue.add(val.getKey());
            if(queue.size()  > k){
                if(treeMap.get(queue.peek()) < (int) val.getValue() ){
                    queue.remove();
                }
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = (int)queue.remove();
        }
        return res;
    }
    public static int[] topKFrequentAppr2(int[] nums, int k){
        //holds key == integer  and its value is integers frequency
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            treeMap.put(nums[i],treeMap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                Map.Entry.comparingByValue(Comparator.reverseOrder()) // Using Map.Entry.comparingByValue() for ascending order
        );
        pq.addAll(treeMap.entrySet());
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = pq.remove().getKey();
        }
        return res;
    }
}
