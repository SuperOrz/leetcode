package com.leetcode;

import java.util.Stack;

public class No20_Valid_Parentheses {
    public boolean isValid(String s) {
        boolean result = true;
        if(s.trim().length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        loop:
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{') stack.push(c);
            else{
                if(stack.isEmpty()) {
                    result = false;
                    break loop;
                }else{
                    char pre = stack.pop();
                    if(pre=='('&&c==')') continue;
                    else if(pre=='{'&&c=='}') continue;
                    else if(pre=='['&&c==']') continue;
                    else {
                        result = false;
                        break loop;
                    }
                }
            }
        }
        if(!stack.isEmpty()) result=false;
        return result;
    }
}
