package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {

        for(int val: findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})){
            System.out.println(val);
        }

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        for(int i=1;i<=nums.length;i++){
            if(!hashSet.contains(i))
                list.add(i);
        }
        return list;
    }
}
