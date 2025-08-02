package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
    String s = "badc";
    String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> hm = new HashMap<>();


        for(int i=0;i<s.length();i++){
            var sChar = s.charAt(i);
            var tChar = t.charAt(i);

            if(!(hm.containsKey(sChar))){
              for(Map.Entry val : hm.entrySet()){
                  if(tChar == (char) val.getValue()){
                      return false;
                  }
              }
                hm.put(sChar,tChar);
            }else if(hm.get(sChar) != tChar){
                return false;
            }
        }
        return true;
    }
}