package strings;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        System.out.println( reverse(120));
    }
    public static int reverse(int x) {
        String s = Integer.toString(x);
        StringBuilder str = new StringBuilder(s);
        boolean isNegative = false;
        if(s.charAt(0) == '-') {
            isNegative = true;
            str.deleteCharAt(0);
        }
        str.reverse();

        try {
            long var = Long.parseLong(str.toString());
            if(var > Integer.MAX_VALUE || var < Integer.MIN_VALUE)
                return 0;
            int res = (int) var;
            return isNegative?-res:res;
        }catch (NumberFormatException ex){
            return 0;
        }
    }
}
