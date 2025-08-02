import java.util.Arrays;

public class reverseInGroups {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[arr.length];
        int k = 4;
        int temp ;
        int count = 0;
        for(int i=1;i<=arr.length/k;i++){
            temp = k * i -1;
           for(int j=1;j<=k;j++){
               arr2[count++] = arr[temp--];
           }
        }
        System.out.println(Arrays.toString(arr2));
    }

}
