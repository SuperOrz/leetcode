/** 
 * Date: 2016年6月15日
 */
package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author name<mail>
 * @since 2016年6月15日
 */
public class No128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int j = i + 1;
                while (set.contains(j)) {
                    j++;
                }
                max = Math.max(max, j - i);
            }
        }
        return max;
    }
}
