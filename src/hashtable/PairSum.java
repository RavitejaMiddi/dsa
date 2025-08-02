package hashtable;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairSum {
    public static void main(String[] args) {
        int[] a = {3,3};
        int target = 6;

        System.out.println(twoSum(a,target));

    }
    public static boolean twoSum(int[] a, int target){
        int[] arr = new int[2];
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length-1;i++){
            int val = target - a[i];
            if(hs.contains(val)){
                return true;
            }
            hs.add(a[i]);
        }



        return false;
    }
}
