package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        System.out.println(wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set =new HashSet<>(wordDict);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(set.contains(str.append(s.charAt(i)).toString())){
               str.setLength(0);
            }
        }

        return str.isEmpty();
    }
}
