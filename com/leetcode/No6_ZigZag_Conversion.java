package com.leetcode;

public class No6_ZigZag_Conversion {
	public String convert(String s, int numRows) {
		if (s.length() < numRows || numRows == 1)
			return s;
		StringBuilder sb = new StringBuilder();
		int index;
		index = 0;
		while (index < s.length()) {
			sb.append(s.charAt(index));
			index += (numRows - 2) * 2 + 2;
		}
		for (int i = 2; i < numRows; i++) {
			index = i - 1;
			boolean odd = true;
			while (index < s.length()) {
				sb.append(s.charAt(index));
				if(odd){
					index += (numRows - i - 1) * 2 + 2;
					odd = !odd;
				}else{
					index += (i - 2) * 2 + 2;
					odd = !odd;
				}
			}
		}
		index = numRows - 1;
		while (index < s.length()) {
			sb.append(s.charAt(index));
			index += (numRows - 2) * 2 + 2;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		No6_ZigZag_Conversion cl = new No6_ZigZag_Conversion();
		System.out.println(cl.convert("paypalishiring", 4));
	}
}
