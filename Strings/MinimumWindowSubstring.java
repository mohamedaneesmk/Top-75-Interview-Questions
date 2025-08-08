package Strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.minWindow("ADOBECODEBANC", "ABC"));  // Output: "BANC"
        System.out.println(sol.minWindow("a", "a"));                // Output: "a"
        System.out.println(sol.minWindow("a", "aa"));               // Output: ""
    }
}

// Remove 'public' from the second class
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int have = 0, need = tCount.size();
        int left = 0, minLen = Integer.MAX_VALUE;
        int resLeft = 0, resRight = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && window.get(c).intValue() == tCount.get(c).intValue()) {
                have++;
            }

            while (have == need) {
                // Update result
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    resLeft = left;
                    resRight = right;
                }

                // Shrink the window from the left
                char lChar = s.charAt(left);
                window.put(lChar, window.get(lChar) - 1);
                if (tCount.containsKey(lChar) && window.get(lChar).intValue() < tCount.get(lChar).intValue()) {
                    have--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(resLeft, resRight + 1);
    }
}
