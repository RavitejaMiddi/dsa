package hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        int index = -1;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),1);
            else
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return index;
    }
}
