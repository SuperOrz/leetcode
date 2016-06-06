package com.leetcode;

public class No44_Wildcard_Matching {
    public boolean isMatch(String s, String p) {
        if(s.equals("") && p.equals("")) return true;
        if(s.equals("") || p.equals("")) return false;
        if(s.charAt(0)==p.charAt(0) && p.charAt(0)=='?')
            if(s.length()==1 && p.length()==1) return true;
            else if(s.length()>1 && p.length()>1)
                return isMatch(s.substring(1), p.substring(1));
            else return false;
        else if(p.charAt(0)=='*'){
            if(p.length()==1) return true;
            else{
                return isMatch(s, s.charAt(0)+p.substring(1)) ||
                        isMatch(s.substring(1), p) ||
                        isMatch(s, p.substring(1));
            }
        }
        return false;
    }
}
