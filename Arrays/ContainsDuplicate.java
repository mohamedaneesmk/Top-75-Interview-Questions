// Problem: Check if an array contains duplicates

package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean isFound = findDuplicates(nums);
        System.out.println(isFound);
    }

    private static boolean findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;
    }    
}
