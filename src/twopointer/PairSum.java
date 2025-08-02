package twopointer;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {-3,-2,-1};
        int target  = -5;
     pair_sum_sorted(arr,target);
    }

    private static void pair_sum_sorted(int[] arr, int target) {
        int left = 0;
        int len = arr.length - 1;
        int right = len;
        for(int i = 0; i< len; i++) {
            int sum = arr[left] + arr[right];
            if (left <= right) {
                if (sum == target){
                    System.out.println(left + ":" + right);
                    return;}
                else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
