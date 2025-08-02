package binarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {

        int target = 3;
        System.out.println(binaryalgo(target));
    }
    public static int binaryalgo(int target){
        int[] arr = {1,3,5,7,8,12,13,45,67,88,99};
        int start = 0 , end = arr.length -1 ;

        while(start <= end){
            int mid = (start + end)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
