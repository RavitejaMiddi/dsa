package binarySearch;

public class FirstAndLastOccOfN {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int num = 5;
        System.out.println(firstOcc(arr,num) +" : " + lastOcc(arr,num));
    }

    public static int firstOcc(int[] arr, int num){
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == num){
                res = mid;
                high = mid -1;
            }else if(num < arr[mid] ){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return res;

    }
    public static  int lastOcc(int[] arr, int num){
        int low = 0;
        int high = arr.length -1 ;
        int res = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(num == arr[mid]){
                res = mid;
                low = mid +1;
            }else if(num < arr[mid]){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return  res;
    }
}
