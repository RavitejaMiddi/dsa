package twopointer;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int first = 0;
        int second = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[second] != val){
                nums[first++] = nums[second++];
                count++;
            }else {
                second++;
            }
        }
        return count;
    }
}
