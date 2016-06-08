package com.leetcode;

public class No59_Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int direction = 0;
        int i=0;
        int j=0;
        int action = 1;
        while(action<=n*n){
            if(action==n*n){
                result[i][j] = action++;
            }else{
                switch (direction%4) {
                    case 0:
                        if(j+1<n && result[i][j+1]==0){
                            result[i][j] = action++;
                            j=j+1;
                        }else{
                            direction++;
                        }
                        break;
                    case 1:
                        if(i+1<n && result[i+1][j]==0){
                            result[i][j] = action++;
                            i=i+1;
                        }
                        else{
                            direction++;
                        }
                        break;
                    case 2:
                        if(j-1>=0 && result[i][j-1]==0){
                            result[i][j] = action++;
                            j=j-1;
                        }else{
                            direction++;
                        }
                        break;
                    case 3:
                        if(i-1>=0 && result[i-1][j]==0){
                            result[i][j] = action++;
                            i=i-1;
                        }
                        else{
                            direction++;
                        }
                        break;
                }
            }
        }
        return result;
    }
}
