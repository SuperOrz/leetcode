package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No93_Restore_IP_Addresses {
    public List<String> restoreIpAddresses(String s) {
        return help(s,4);
    }
    private List<String> help(String s,int n){
        List<String> result = new ArrayList<>();
        if(n==1){
            if(isLegal(s)){
                result.add(s);
            }
            else 
                return null;
        }else{
            for(int i=1;i<s.length()&&i<4;i++){
                if(isLegal(s.substring(0,i))){
                    List<String> temp = help(s.substring(i), n-1);
                    if(temp!=null){
                        for(String str:temp){
                            result.add(s.substring(0,i)+"."+str);
                        }
                    }
                }
            }
        }
        return result; 
    }
    private boolean isLegal(String s){
        boolean legal = true;
        if(s.length()>3)
            legal = false;
        else if(s!=null && !s.equals("") && Integer.parseInt(s)>255)
            legal = false;
        else if(s.length()>1 && s.startsWith("0"))
            legal = false;
        return legal;
            
    }
}
