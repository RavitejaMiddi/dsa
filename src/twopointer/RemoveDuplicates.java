package twopointer;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int prev = 0;
        int next = 0;

        while (next < nums.length) {
            if (nums[prev] != nums[next]) {
                nums[++prev] = nums[next];
                count++;
            } else {
                next++;
            }
        }
        return count;
    }
}
