package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No216_Combination_Sum_III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        return helper(k, n, 0);
    }
    private List<List<Integer>> helper(int k,int n,int least){
        List<List<Integer>> result = new ArrayList<>();
        if(k==0 || least>=9) return result;
        if(k==1 && n>least){
            if(n<10){
                List<Integer> temp = new ArrayList<>();
                temp.add(n);
                result.add(temp);
            }
            return result;
        }
        for(int i=least+1;i<n && i<=9;i++){
            List<List<Integer>> sub = helper(k-1,n-i,i);
            while(!sub.isEmpty()){
                List<Integer> temp = sub.get(0);
                temp.add(0, i);
                result.add(temp);
                sub.remove(0);
            }
        }
        return result;
    }
}
