package com.leetcode;


public class No322_Coin_Change {
	public int coinChange(int[] coins, int amount) {
	    if (coins == null || coins.length == 0 || amount < 0) {
	        return -1;
	    }
	    int[] f = new int[amount + 1];
	    f[0] = 0;
	    for (int coin : coins) {
	        if (coin > amount) {
	            break;
	        }
	        f[coin] = 1;
	    }
	    for (int i = 1; i <= amount; i++) {
	        if (f[i] == 0) {
	            f[i] = Integer.MAX_VALUE;
	        }
	    }
	    for (int i = 1; i <= amount; i++) {
	        for (int j = 0; j < coins.length; j++) {
	            if (coins[j] <= i && f[i - coins[j]] != Integer.MAX_VALUE) {
	                f[i] = Math.min(f[i], 1 + f[i - coins[j]]);
	            }
	        }
	    }
	    return f[amount] == Integer.MAX_VALUE ? -1 : f[amount];
	}
}