package hashtable;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcd"));

    }
    public static int lengthOfLongestSubstring(String s) {
        int oldSub = 0;
        for(int i=0;i<s.length();i++){
            var val = findSubString(s.substring(i));
            oldSub = Math.max(val,oldSub);
        }
        return oldSub;
    }
        public static int findSubString(String str){
            int sub = 0;
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<str.length();i++){
                var val = str.charAt(i);
                if(!set.contains(val)){
                    set.add(val);
                    sub++;
                }else return sub;
            }
            return sub;
        }
}
