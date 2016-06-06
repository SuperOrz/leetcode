package com.leetcode;

public class No121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int max = 0;
        int min = 0;
        int result = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[max]){
                max = i;
                int temp = prices[max]-prices[min];
                if(result < temp)
                    result = temp;
            }
            if(prices[i]<prices[min]){
                max = min = i;
            }
        }
        return result;
    }
}
