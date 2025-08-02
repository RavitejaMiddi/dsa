package binarySearch;

public class KeyInSortedArr {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(keyInArr(arr,3));
    }

    public static  int keyInArr(int[] arr,int target){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high)/ 2;

            if(arr[mid] == target){
                return mid;
            }else if( arr[mid] > target){
                low = mid + 1;
            }else if(arr[mid] < target){
                high  = mid - 1;
            }
        }
        return -1;
    }
}
