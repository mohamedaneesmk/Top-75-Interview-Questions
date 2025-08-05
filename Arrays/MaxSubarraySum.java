// Problem: Find the contiguous subarray with the largest sum.

package Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Start with first element
        int currentSum = nums[0];  // Start with first element

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);  // Update maxSum if needed
        }

        return maxSum;
    }
}
