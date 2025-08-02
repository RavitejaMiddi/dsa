package hashtable;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {

        System.out.println(maxNumberOfBalloons("nllbblooon"));
    }
    public  static int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            hm.put(text.charAt(i), hm.getOrDefault(text.charAt(i), 0) + 1);
        }

        int b = hm.getOrDefault('b', 0);
        int a = hm.getOrDefault('a', 0);
        int l = hm.getOrDefault('l', 0) / 2;
        int o = hm.getOrDefault('o', 0) / 2;
        int n = hm.getOrDefault('n', 0);

        return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
    }

}
