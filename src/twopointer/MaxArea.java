package twopointer;

public class MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int first = 0;
        int last = height.length - 1;

        while (first<last){
            int diff = Math.abs(first-last);
            int min = Math.min(height[first],height[last]);
            int sum = diff * min;
            if(sum > max)
                max = sum;
            if(height[first] < height[last]) first++;
            else last--;
        }
        return max;
    }
}
