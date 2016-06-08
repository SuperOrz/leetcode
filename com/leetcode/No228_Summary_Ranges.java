package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No228_Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length!=0){
            int begin = nums[0];
            int curr = nums[0];
            int last = nums[0];
            if(nums.length==1){
                result.add(""+begin);
            }else{
                for(int i=1;i<nums.length;i++){
                    curr = nums[i];
                    if(curr-last!=1){
                        String s = "";
                        if(begin!=last){
                            s = begin+"->"+last;
                        }else{
                            s = begin+"";
                        }
                        result.add(s);
                        begin = last = curr;
                    }else{
                        last = curr;
                    }
                }
                String s = "";
                if(begin!=last){
                    s = begin+"->"+last;
                }else{
                    s = begin+"";
                }
                result.add(s);
            }
        }
        return result;
    }
}
