package hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetOfArray {
    public static void main(String[] args) {

        int[] a = { 11,  13, 21, 3, 7 };
        int[] b = { 11, 3, 7, 1 };

        System.out.println(isPresentOrNot(a,b));
    }
    public static boolean isPresentOrNot(int[] a, int[] b){
        Set<Integer> hs = new HashSet<>();

        for(int num : a){
            hs.add(Integer.valueOf(num));
        }

        for(int num: b){
            if(!(hs.contains(num))){
                return false;
            }
        }

        return true;
    }
}
