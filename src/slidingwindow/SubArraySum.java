package slidingwindow;

public class SubArraySum {
    public static void main(String[] args) {
        System.out.println(subArrSum(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20},4));
    }
    public static int subArrSum(int[] arr,int k){
        int maxSum = 0;
        int pointer = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(i>=k-1){
               if(maxSum < sum)
                   maxSum = sum;
               sum  = sum - arr[pointer++];
            }
        }
        return maxSum;
    }
}
