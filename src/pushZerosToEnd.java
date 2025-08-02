import java.util.Arrays;

public class pushZerosToEnd {
    public static void main(String[] args) {
    int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//        int[] arr = {0,0};

        int p1=0,p2=1;
        for(int i=0;i<arr.length;i++) {
            if (! (p2 > arr.length-1)) {
                if (arr[p1] != 0) {
                    p1++;
                    p2 += 1;
                } else if (arr[p1] == 0 && arr[p2] == 0) {
                    p2 = p2 + 1;
                } else {
                    int dummy = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = dummy;
                    p1++;
                    p2 += 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
