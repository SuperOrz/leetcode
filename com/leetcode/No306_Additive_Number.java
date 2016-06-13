package com.leetcode;

import java.math.BigInteger;

public class No306_Additive_Number {
    public boolean isAdditiveNumber(String num) {
        boolean flag = false;
        for(int i=1;i<=num.length()/2+1;i++){
            if(i!=1 && num.startsWith("0"))
                break;
            BigInteger b1 = new BigInteger(num.substring(0,i));
            String left = num.substring(i);
            if(left.equals(""))
                continue;
            for(int j = 1;j<=left.length()/2+1;j++){
                if(j!=1 && left.startsWith("0"))
                    continue;
                BigInteger b2 = new BigInteger(left.substring(0,j));
                String s = b1.add(b2).toString();
                if(left.substring(j).startsWith(s) && left.substring(j).endsWith(s)){
                    flag = true;
                    break;
                }
                else if(left.substring(j).startsWith(s))
                    flag = isAdditiveNumber(left);
                else
                    continue;
            }
        }
        return flag;
    }
}
