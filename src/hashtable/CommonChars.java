package hashtable;

import java.util.*;

public class CommonChars {
    public static void main(String[] args) {
        for(String val: commonChars(new String[]{"bella","label"})){
            System.out.println(val);
        }



    }
    public static List<String> commonChars(String[] words) {
       List<String> commChar = new ArrayList<>();
       ArrayList<Set<Character>> list = new ArrayList<>();

    for(int i=0;i<words.length;i++) {
        Set<Character> setChar = new HashSet<>();
       for(int j=0;j<words[i].length();j++){
            setChar.add(words[i].charAt(j));
       }
       list.add(setChar);
    }

        Set<Character> common = new HashSet<>(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            common.retainAll(list.get(i)); // keep only common elements
        }

        for(char ch: common){
            commChar.add(String.valueOf(ch));
        }
        return commChar;
    }
}
