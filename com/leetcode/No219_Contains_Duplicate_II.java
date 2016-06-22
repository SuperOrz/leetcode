/**
 * Copyright 2014-2015, NetEase, Inc. All Rights Reserved.
 * 
 * Date: 2016年6月22日
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author name<mail>
 * @since 2016年6月22日
 */
public class No219_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index])) {
                int preIndex = map.get(nums[index]);
                if (index - preIndex <= k) {
                    result = true;
                    break;
                } else {
                    map.put(nums[index], index);
                }
            } else {
                map.put(nums[index], index);
            }
        }
        return result;
    }
}
