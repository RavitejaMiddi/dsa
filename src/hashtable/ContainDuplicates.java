package hashtable;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public static void main(String[] args) {
        System.out.println(containDupli(new int[]{1,2,3}));

    }
    public static boolean containDupli(int[] arr){
        Set<Integer> set = new HashSet<>();
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]))
               set.add(arr[i]);
            else
                return true;
        }
        return false;
    }
}
