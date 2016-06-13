package com.leetcode;

public class No338_Counting_Bits {
    public int[] countBits(int num) {
       int[] result = new int[num+1];
       if(num==0){
           result[0] = 0; 
       }
       if(num==1){
           result[0] = 0;
           result[1] = 1;
       }
       if(num>1){
           result[0] = 0;
           result[1] = 1;
           for(int i=1;Math.pow(2, i-1)<=num;i++){
               for(int j = (int)Math.pow(2, i-1)+1;j<(int) Math.pow(2, i)&&j<=num;j++){
                   result[j] = 1+result[(int)(j-Math.pow(2, i-1))];
               }
               result[(int) Math.pow(2,i-1)]=1;
           }
       }
       return result;
    }
}
