// Problem: Merge two sorted arrays into one sorted array

package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {4,5,6};
        int n = 3;
        findMergedSortedArray(nums1,nums2,m,n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void findMergedSortedArray(int[] nums1, int[] nums2,int m,int n) {
        int i = m-1; 
        int j = n-1; 
        int k=m+n-1; 

        while(i>=0&&j>=0){               
            if(nums1[i]>nums2[j])        
                nums1[k--]=nums1[i--];
            else
                nums1[k--] = nums2[j--]; 
        }

        // Remaing elements 
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}