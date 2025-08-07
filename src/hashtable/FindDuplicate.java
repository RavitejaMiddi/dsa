package hashtable;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {


    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            if(set.contains(val))
                return val;
            else
                set.add(val);
        }
        return -1;
    }
}
