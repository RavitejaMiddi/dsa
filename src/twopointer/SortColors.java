package twopointer;

public class SortColors {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
    public static void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
                countZero++;
            else if(nums[i] == 1)
                countOne++;
        }
        for(int i=0;i<nums.length;i++){
            if(countZero > 0) {
                nums[i] = 0;
                countZero--;
            }
            else if(countOne > 0) {
                nums[i] = 1;
                countOne--;
            }
            else nums[i] = 2;
        }
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]<nums[i]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

        }


}
