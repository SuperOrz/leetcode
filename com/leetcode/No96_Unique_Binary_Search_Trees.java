package com.leetcode;

public class No96_Unique_Binary_Search_Trees {
    public int numTrees(int n) {
        int[] temp = new int[n+1];
        temp[0]=1;
        temp[1]=1;
        for(int i=1;i<=n;i++){
            help(i,temp);
        }
        return temp[n];
    }
    private void help(int n,int[] temp){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=temp[i]*temp[n-i-1];
        }
        temp[n] = sum;
    }
}
