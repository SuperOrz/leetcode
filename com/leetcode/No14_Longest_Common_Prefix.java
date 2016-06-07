package com.leetcode;

public class No14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        char[][] chars = new char[strs.length][];
        for(int i=0;i<strs.length;i++){
            chars[i] = strs[i].toCharArray();
        }
        int length = 0;
        boolean flag = true;
        for(int i=0;;i++){
            try{
                char curr = chars[0][i];
                for(int j=0;j<strs.length;j++){
                    if(curr!=chars[j][i]){
                        flag = false;
                        break;
                    }
                }
                if(flag) length++;
                else break;
            }catch(IndexOutOfBoundsException e){
                break;
            }
        }
        if(length==0)
            return "";
        else
            return  strs[0].substring(0, length);
    }
}
