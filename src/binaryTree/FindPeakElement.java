package binaryTree;

public class FindPeakElement {
    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
    public static int findPeakElement(int[] nums) {
        int peak = 0;

        for(int i=0;i<nums.length;i=i+2){
            if((2*i+2) < nums.length && nums[i] > nums[2*i+2]){
                return i;
            }else if((2*i+2) < nums.length && nums[i] != nums[2*i+2]) return (2*i+2);
        }
        return peak;
    }
}
