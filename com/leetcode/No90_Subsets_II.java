package com.leetcode;

import java.util.*;;

public class No90_Subsets_II {
	Set<List<Integer>> set = new HashSet<>();
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		set.add(new ArrayList<Integer>());
		for(int i=1;i<=nums.length;i++){
			int[] temp = new int[i];
			dfs(temp,0,0,nums);
		}
		List<List<Integer>> result = new ArrayList<>();
		for(List<Integer> list:set){
			result.add(list);
		}
        return result;
    }
	private void dfs(int[] temp, int index,int index2, int[] nums) {
		if(index==temp.length){
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<temp.length;i++){
				list.add(temp[i]);
			}
			set.add(list);
		}else if(index2==nums.length){
			return;
		}else{
			for(int i=index2;i<nums.length;i++){
				temp[index]=nums[i];
				dfs(temp,index+1,i+1,nums);
			}
		}
	}
}
