package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindWords {
     static HashSet<Character> firstRow = new HashSet<>(Arrays.asList(new Character[]{'q','w','e','r','t','y','u','i','o','p'}));
     static HashSet<Character> secondRow = new HashSet<>(Arrays.asList(new Character[]{'a','s','d','f','g','h','j','k','l'}));
     static HashSet<Character> thirdRow = new HashSet<>(Arrays.asList(new Character[]{'z','x','c','v','b','n','m'}));
    public static void main(String[] args) {
        for(String word: findWords(new String[]{"adsdf","sfd"})){
            System.out.println(word);
        }
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList();
        for (String word : words) {
            var row = whichRow(word);
            if(findRemChar(word.toLowerCase(),row))
                list.add(word);
        }
        String[] arr = new String[list.size()];
        return list.toArray(arr);
    }
    //finding the first character of a word where it is present
    public  static int whichRow(String word){
        if(firstRow.contains(Character.toLowerCase(word.charAt(0))))
            return 1;
        else if (secondRow.contains(Character.toLowerCase((word.charAt(0)))))
            return 2;
        else if(thirdRow.contains((Character.toLowerCase(word.charAt(0)))))
            return 3;
        return 0;
    }
    //check based on row if all characters are present in same row
    public static boolean findRemChar(String word, int row){
        for(int i=1;i<word.length();i++){
            if(row == 1 &&  !firstRow.contains(word.charAt(i)))
               return false;
            else if(row == 2 &&  !secondRow.contains(word.charAt(i)))
                return false;
            else if(row == 3 &&  !thirdRow.contains(word.charAt(i)))
                return false;
        }
        return  true;
    }
}
