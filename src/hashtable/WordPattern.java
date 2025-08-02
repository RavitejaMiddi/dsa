package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abab","dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] input = s.split(" ");
        HashSet<String> setOfS = new HashSet<>(Arrays.asList(input));
        HashSet<Character> setOfPattern = new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            setOfPattern.add(pattern.charAt(i));
        }

        if(pattern.length() != input.length)
            return false;
        if(setOfPattern.size() == setOfS.size())
            return true;
        else
            return false;
    }

}
