package com.leetcode;

public class No48_Rotate_Image {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        if(n==1) return;
        for(int i=0;i<=n/2-1;i++){
            int x = i;
            int y = n-x-1;
            for(int j=0;j+x<y;j++){
                int temp = matrix[x+j][y];
                matrix[x+j][y] = matrix[x][x+j];
                matrix[x][x+j] = matrix[y-j][x];
                matrix[y-j][x] = matrix[y][y-j];
                matrix[y][y-j] = temp;
            }
        }
    }
}
