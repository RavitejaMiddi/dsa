package hashtable;

public class Search {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},12));
    }
    public  static int search(int[] nums, int target) {
        return findEle(nums,target,0,nums.length-1);
    }

    private static int findEle(int[] arr, int target,int begin,int end){
        if (begin > end) return -1;
        int mid = (begin + end) / 2;
        if(arr[mid] == target)
            return mid;
        return (arr[mid] < target) ? findEle(arr,target,mid+1,end):findEle(arr,target,begin,mid-1);
    }
}
