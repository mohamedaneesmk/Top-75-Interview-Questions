// Problem: Return an array where each element is the product of all other elements.

package Arrays;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = findProductOfArray(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findProductOfArray(int[] nums) {
        int[] answer = new int[nums.length];
        int productOfLeft = 1;
        int productOfRight = 1;

        // From right to left 
        for(int i=nums.length-1;i>=0;i--){
            answer[i]=productOfRight;
            productOfRight*=nums[i];
        }

        // From the left to right and multiply the values with right
        for(int i=0;i<nums.length;i++){
            answer[i] = answer[i] * productOfLeft;
            productOfLeft *= nums[i];
        }

        return answer;
    }
}
