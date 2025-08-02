package binarySearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4,2,3};
        System.out.println(minElement(arr));

    }
    public static int minElement(int[] arr){
        int min = arr[0];
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (min < arr[mid]) {
                low = mid + 1;
            } else if (min > arr[mid]) {
                min= arr[mid];
                high = mid - 1;
            }

        }

        return min;
    }
}
