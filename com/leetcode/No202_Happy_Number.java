package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No202_Happy_Number {
    public boolean isHappy(int n) {
        boolean result = false;
        if(n==1) return true;
        Set<Integer> set = new HashSet<>();
        int temp = helper(n);
        while(!set.contains(temp)){
            set.add(temp);
            temp = helper(temp);
            if(temp==1) {
                result = true;
                break;
            }
        }
        return result;
    }

    private int helper(int n) {
        List<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n=n/10;
        }
        int result = 0;
        for(Integer i:list){
            result+=i*i;
        }
        return result;
    }
}
