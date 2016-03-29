package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No3_Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		int count = 0;
		char[] str = s.toCharArray();
		int len = str.length;
		int lastModify = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			if (map.get(str[i]) == null) {
				count++;
			} else {
				int lastIndex = map.get(str[i]);
				if (count > max)
					max = count;
				if (i - lastIndex <= count)
					count = i - lastIndex;
				else
					count++;
			}
			map.put(str[i], i);
		}
		if (count > max)
			max = count;
		return max;
	}
}
