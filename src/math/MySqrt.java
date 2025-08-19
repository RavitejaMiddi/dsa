package math;

public class MySqrt {

    public static void main(String[] args) {

        System.out.println(mySqrt(9));


    }
    public static int mySqrt(int x) {
        int beg = 1;
        int end = x;
        int sqrt = x;
       while (beg<= end){
           int mid = beg + (end-beg)/2;
           if(mid * mid == x)
               return mid;
           else if(mid * mid > x)
               end = mid -1;
           else {
               sqrt = mid;
               beg = mid + 1;
           }
       }
        return sqrt;
    }
}
