package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class FndMedianSortedArrays {
    public static void main(String[] args) {


        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }

    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int[] list = new int[nums1.length+nums2.length];
        int num1Index = 0;
        int num2Index = 0;
        for(int i=0;i<list.length;i++){
            if(num2Index == nums2.length)
                list[i] = nums1[num1Index++];
            else if(num1Index == nums1.length)
                list[i] = nums2[num2Index++];
            else if (nums1[num1Index] < nums2[num2Index]) {
                list[i]  = nums1[num1Index++];
            }else {
                list[i] = nums2[num2Index++];
            }
        }


        if(list.length > 0){
            if(list.length % 2 != 0)
                median =  list[list.length/2];
            else
                median = (double) (list[(list.length / 2) - 1] + list[list.length / 2]) /2;
        }

        return median;
    }
}
