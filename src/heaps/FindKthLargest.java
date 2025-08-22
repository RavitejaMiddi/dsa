package heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class FindKthLargest {
    public static void main(String[] args) {
        System.out.println(findKthLargestEle(new int[]{3,2,1,5,6,4},2));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int val:nums){
            priorityQueue.add(val);
        }
        int res = 0;
        for(int i=1;i<=k;i++){
            res = priorityQueue.remove();
        }
        return res;

    }
    //Approach 2
    public static int findKthLargestEle(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for(int i=0;i<nums.length;i++){
            priorityQueue.add(nums[i]);
            if(priorityQueue.size() > k ){
                priorityQueue.remove();
            }
        }
        return priorityQueue.peek();

    }
}
