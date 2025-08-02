package hashtable;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{0,1}));

    }
    public static int missingNum(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){
            set.add(num);
        }
        System.out.println(arr.length);
        for(int i=0;i<=arr.length;i++){
            if(!set.contains(i))
                return i;
        }
        return -1;
    }
}
