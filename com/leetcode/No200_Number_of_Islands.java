package com.leetcode;

public class No200_Number_of_Islands {
	public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m==0) return 0;
        int n = grid[0].length;
        int result = 0;
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(grid[i][j]=='1'){
        			result++;
        			check(grid,i,j);
        		}
        	}
        }
        return result;
    }

	private void check(char[][] grid, int i, int j) {
		int m = grid.length;
        int n = grid[0].length;
		if(grid[i][j]=='1'){
			grid[i][j]='0';
			if(i<m-1) check(grid, i+1, j);
			if(j<n-1) check(grid, i, j+1);
			if(i>0) check(grid, i-1, j);
			if(j>0) check(grid, i, j-1);
		}
	}
}
