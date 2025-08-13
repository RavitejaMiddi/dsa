package randomPrblms;

public class LinearSearchAlgo {
    static int[] array = {1,4,3,56,76,8,10};
    public static void main(String[] args) {
        int[] array = {1,4,3,56,76,8,10};
        int target = 89;
//        for(int i=0;i< array.length;i++){
//            if(array[i] == target) {
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println("Not found");
        System.out.println(linearUsingTransposition(76));
        System.out.println(linearUsingTransposition(76));
        System.out.println(linearUsingTransposition(76));

    }
    public static int linearUsingTransposition(int target){
        int len = array.length;
        for(int i=0;i<len;i++){
            if(array[i] == target){
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                return i;
            }
        }
        return -1;
    }
}
