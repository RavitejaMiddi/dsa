package randomPrblms;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
     //   int[] arr = {12,35,1,10,34,1};
//int[] arr = {10,5,10};
       int[] arr = {10,10,10};


        int max = 0;
        int secondMax = 0;
        // time - O(n) & space - O(1)
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            } else if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax != 0 ? secondMax : -1);
        System.out.println(usingSortedApproach(arr));
    }
// time - O(n * log(N)) for sort and traversal O(n) = O(n * log(N)) + O(N) = O(n * log(N)) & space - O(N)
    private static int usingSortedApproach(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i] != arr[n-1])
                return arr[i];
        }

        return -1;
    }
}
