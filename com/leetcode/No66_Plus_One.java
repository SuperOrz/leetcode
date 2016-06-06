package com.leetcode;

public class No66_Plus_One {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean flag = true;
        for(int i=len-1;i>=0;i--){
            int curr = digits[i];
            if(flag){
                if(curr+1==10)
                    digits[i]=0;
                else{
                    digits[i]=curr+1;
                    flag=false;
                }
            }else
                break;
        }
        int[] result;
        if(flag){
            result = new int[len+1];
            result[0] = 1;
            for(int i=0;i<len;i++){
                result[i+1] = digits[i];
            }
        }else{
            result = digits;
        }
        return result;
    }
}
