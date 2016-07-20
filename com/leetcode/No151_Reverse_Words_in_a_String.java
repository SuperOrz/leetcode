package com.leetcode;

public class No151_Reverse_Words_in_a_String {
	public String reverseWords(String s) {
		if(s==null || s.trim().equals("")) return "";
        StringBuilder sb = new StringBuilder();
        String[] strs = s.trim().split(" ");
        for(int i=strs.length-1;i>=0;i--){
        	if(!strs[i].trim().equals("")){
        		sb.append(strs[i]);
        		if(i!=0) sb.append(" ");
        	}
        }
        return sb.toString();
    }	 
	public static void main(String[] args) {
		No151_Reverse_Words_in_a_String no = new No151_Reverse_Words_in_a_String();
		System.out.println(no.reverseWords("   a   b"));
	}
}
