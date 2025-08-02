package hashtable;

import java.util.HashMap;
import java.util.Map;

public class NumJewelsInStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map<Integer,Character> map = new HashMap<>();
        for(int i=0;i<jewels.length();i++){
            map.put(i,jewels.charAt(i));
        }

        for(int i=0;i<stones.length();i++){
            if(map.containsValue(stones.charAt(i))){
                count++;
            }
        }

        return count;
    }
}
