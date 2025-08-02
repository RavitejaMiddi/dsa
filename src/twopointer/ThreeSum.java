package twopointer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int len = arr.length -1;
        int fp = 0;
        int left = fp +1;
        int right = len;
        List<int[]> threeSumArr = new ArrayList<int[]>();
        Arrays.sort(arr);
        for(int i=0;i< len ;i++) {
            int sum = arr[fp] + arr[left] + arr[right];
            if (left <= right) {
                if (sum == 0) {
                    threeSumArr.add(new int[]{arr[fp], arr[left], arr[right]});
                } else if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }
            }
        }
    }
}
