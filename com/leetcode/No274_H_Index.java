package com.leetcode;

import java.util.Arrays;

public class No274_H_Index {
	public int hIndex(int[] citations) {
		if(citations==null || citations.length==0) return 0;
        Arrays.sort(citations);
        int count = 0;
        for(int i=citations.length-1;i>=0;i--){
        	if(citations[i]>=citations.length-i) count++;
        	else break;
        }
        return count;
    }
}
