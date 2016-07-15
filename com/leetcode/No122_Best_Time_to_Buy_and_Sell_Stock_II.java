package com.leetcode;

public class No122_Best_Time_to_Buy_and_Sell_Stock_II {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int money = 0;
		boolean priceIs0 = false;
		for(int i=0;i<prices.length;i++){
			if(i==prices.length-1){
				if(money<0){
					money += prices[i];
					if(money>0) profit+=money;
				}else if(money==0&&priceIs0){
					profit+=prices[i];
				}
			}else{
				if(money==0&&!priceIs0){
					if(prices[i]<prices[i+1]){
						money -= prices[i];
						if(prices[i]==0) priceIs0=true;
					}
					else
						continue;
				}else{
					if(prices[i]>prices[i+1]){
						if(money==0) priceIs0=false;
						money += prices[i];
						if(money>0) profit+=money;
						money = 0;
					}else
						continue;
				}
			}
		}
		return profit;
    }
	public int maxProfit2(int[] prices) {
        int len = prices.length;
        if(len<2) return 0;
		int maxp = 0;
		for(int i=1;i<len;i++){
			if(prices[i]>prices[i-1]) maxp+=prices[i]-prices[i-1];
		}
		return maxp;
    }
}
