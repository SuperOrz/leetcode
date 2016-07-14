package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class No347_Top_K_Frequent_Elements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i])+1);
			else
				map.put(nums[i], 1);
		}
		Map<Integer, List<Integer>> map2 = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		for(Integer i:map.keySet()){
			int num = map.get(i);
			List<Integer> list = null;
			if(map2.containsKey(num)){
				list = map2.get(num);
			}else{
				list = new ArrayList<>();
			}
			list.add(i);
			map2.put(num, list);
		}
		List<Integer> result = new ArrayList<>();
		Iterator<Integer> it = map2.keySet().iterator();
		while(result.size()<k){
			int key = it.next();
			List list = map2.get(key);
			result.addAll(list);
		}
		return result;
    }
}
