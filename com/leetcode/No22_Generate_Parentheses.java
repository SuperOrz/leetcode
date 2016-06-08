package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No22_Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if(n==0) return result;
        if(n==1){
            Set<String> temp = new HashSet<>();
            temp.add("()");
            for(String s:temp){
                result.add(s);
            }
        }
        if(n>1){
            Set<String> temp = new HashSet<>();
            for(String s:generateParenthesis(n-1)){
                temp.add("("+s+")");
                for(int i=0;i<s.length();i++){
                    temp.add(s.substring(0, i)+"()"+s.substring(i));
                }
            }
            for(String s:temp){
                result.add(s);
            }
        }
        return result;
    }
}
