// Problem: Merge overlapping intervals.

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        
        // Print the result
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval)+" ");
        }
    }

    private static int[][] merge(int[][] intervals) {
        // Step 1: Sort the intervals by start time
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for(int[] interval:intervals){
            // Step 2: If merged is empty or no overlap, just add the interval
            if(merged.isEmpty()||merged.get(merged.size()-1)[1] < interval[0])
                merged.add(interval);
            // Step 3: There is overlap, so merge
            else  
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
