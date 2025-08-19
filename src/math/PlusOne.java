package math;

import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args) {
        for(int val :plusOne(new int[]{1,2,3})){
            System.out.print(val);
        }
    }
    public static int[] plusOne(int[] digits) {

      for(int i=digits.length-1;i>=0;i--){
          digits[i]++;
          if(digits[i] < 10)
              return digits;
          digits[i] = 0;
      }
      int[] res = new int[digits.length +1];
      res[0] = 1;
      return res;
    }

}
