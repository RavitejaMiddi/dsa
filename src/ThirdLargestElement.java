public class ThirdLargestElement {
    public static void main(String[] args) {

        int[] arr = {1, 14, 2, 16, 10, 20};
   //  int[] arr = {19, -10, 20, 14, 2, 16, 10};
//        int[] arr = {-10, -3, -5, -6, -20};
//        int[] arr = {10,3,5,6,20};
        int max =Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        // O(N) - time , space - O(1)
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]) {
                thirdMax = secMax;
                secMax = max;
                max = arr[i];
            }
            else if(secMax < arr[i] && secMax != max){
                thirdMax = secMax;
                secMax = arr[i];
            }
            else if(thirdMax < arr[i] && thirdMax != secMax){
                thirdMax = arr[i];
            }

        }
        System.out.println(thirdMax != 0 ? thirdMax : -1);
        System.out.println(max * secMax * thirdMax);
    }
}
