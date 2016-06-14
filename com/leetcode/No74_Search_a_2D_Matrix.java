package com.leetcode;

public class No74_Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = 0;
        int y = cols-1;
        while(!found && x<rows && y>=0){
            if(target == matrix[x][y])
                found = true;
            else if(target > matrix[x][y])
                x++;
            else
                y--;
        }
        return found;
    }
}
