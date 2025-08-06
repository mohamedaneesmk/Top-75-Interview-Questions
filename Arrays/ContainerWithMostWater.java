// Problem: Find the maximum water that can be trapped between two lines. Solution:

package Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWater = findContainerWithMostWater(height);
        System.out.println(maxWater);
    }

    private static int findContainerWithMostWater(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while (left < right) {
            int heightOfContainer = Math.min(height[left],height[right]);
            int width = right - left;
            int area = heightOfContainer * width;
            maxArea = Math.max(maxArea, area);

            // Move the pointer 
            if(height[left]<height[right]) left++;
            else right--;
        }

        return maxArea;
    }   
}
