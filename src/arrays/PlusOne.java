package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = new int[]{1,2,3};
       for(int val: onePlus(digits)){
           System.out.println(val);
       }
    }

    private static int[] onePlus(int[] digits) {
        long sum = 0;
        long mult = 1;
        for(int i = digits.length-1; i>=0; i--){
            int temp= digits[i];
            sum = sum + (temp * mult);
           mult =  mult * 10;
        }
        sum++;

        // Convert the int to a String
        String s = String.valueOf(sum);

        // Create an int array to store the digits
        int[] res = new int[s.length()];

        // Iterate through the string and convert each character to an int
        for (int i = 0; i < s.length(); i++) {
            res[i] = Character.getNumericValue(s.charAt(i));
            // Alternatively: digits[i] = s.charAt(i) - '0';
        }

        return res;
    }
}
