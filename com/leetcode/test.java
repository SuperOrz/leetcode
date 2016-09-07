package com.leetcode;

import java.util.List;

public class test {
	
	public static void main(String[] args) {
		No90_Subsets_II no = new No90_Subsets_II();
		int[] nums = {1,2,2};
		List<List<Integer>> result = no.subsetsWithDup(nums);
		for(List<Integer> list:result){
			for(Integer s:list){
				System.out.println(s);
			}
			System.out.println();
		}
	}
}
