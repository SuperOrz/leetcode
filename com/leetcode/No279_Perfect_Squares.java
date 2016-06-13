package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No279_Perfect_Squares {
    public int numSquares(int n) {
        int[] temp = new int[n+1];
        for(int i=0;i<=n;i++){
            help2(i,temp);
        }
        return temp[n];
    }
    private void help2(int n,int[] temp){
        if(n<=3) temp[n] = n;
        else{
            int min = temp[n-1];
            for(int i=1;i*i<=n;i++){
                min = min<temp[n-i*i]?min:temp[n-i*i];
            }
            temp[n] = min+1;
        }
    }
    private int help(int n,int[] temp){
        if(n==0) return 0;
        if(n<=3) return n;
        List<Integer> resultList = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(temp[n-i*i]==0){
                temp[n-i*i] = numSquares(n-i*i);
            }
            resultList.add(temp[n-i*i]);
        }
        int min = resultList.get(0);
        for(Integer i:resultList){
            min = i<min?i:min;
        }
        return min+1;
    }
}
