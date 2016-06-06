package com.leetcode;

public class No204_Count_Primes {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        boolean[] isPrime = new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime[i] == true){
                if(isPrime(i)){
                    for(int j=2*i;j<n;j+=i){
                        isPrime[j] = false;
                    }
                }
            }
        }
        int result = 0;
        for(int i=0;i<n;i++){
            if(isPrime[i] == true)
                result++;
        }
        return result;
    }
    private boolean isPrime(int n){
        boolean result = true;
        if(n==0 || n==1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                result =false;
                break;
            }
        }
        return result;
    }
}
