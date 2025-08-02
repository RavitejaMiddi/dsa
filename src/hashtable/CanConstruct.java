package hashtable;

import java.util.HashMap;

public class CanConstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            var temp = magazine.charAt(i);
            hm.put(temp, hm.getOrDefault(temp, 0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            var temp = ransomNote.charAt(i);
            if(!hm.containsKey(temp))
                return false;
            else if(hm.get(temp) > 0)
                hm.put(temp,hm.get(temp)-1);
            else return false;
        }
        return true;
    }
}
