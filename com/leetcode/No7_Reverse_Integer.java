package com.leetcode;

public class No7_Reverse_Integer {
	public int reverse(int x) {
        boolean positive = x>=0?true:false;
        int y = positive?x:-x;
        long z = 0;
        while(y>0){
        	z = z*10 + y%10;
        	y = y/10;
        }
        z = positive?z:-z;
        if(z>Integer.MAX_VALUE || z<Integer.MIN_VALUE) z=0;
        return (int)z;
    }
}
