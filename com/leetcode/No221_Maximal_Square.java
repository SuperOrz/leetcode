package com.leetcode;


public class No221_Maximal_Square {
    public int maximalSquare(char[][] matrix) {
        int maxSquare = 0;
        int col=0,row=0;
        row = matrix.length;
        if(row!=0 && matrix[0]!=null) col = matrix[0].length;
        if(row==0 || col==0) return 0;
        int[][] result = new int[row][col];
        for(int i=0;i<row-maxSquare;i++){
            for(int j=0;j<col-maxSquare;j++){
                if(j!=0) result[i][j] = result[i][j-1]-1; 
                else if(i!=0) result[i][j] = result[i-1][j]-1;
                else if(matrix[i][j]=='1') result[i][j]=1;
                while(judge(matrix, i, j, result[i][j])){
                    result[i][j]++;
                }
                if(result[i][j]>maxSquare) maxSquare = result[i][j];
            }
        }
        return maxSquare*maxSquare;
    }
    private boolean judge(char[][] matrix,int i,int j,int result){
        boolean flag = true;
        for(int index=i;index<=i+result&&index<matrix.length;index++){
            if(j+result>=matrix[0].length) {
                flag = false;
                break;
            }else{
                if(matrix[index][j+result]=='0'){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            for(int index=j;index<=j+result&&index<matrix[0].length;index++){
                if(i+result>=matrix.length) {
                    flag = false;
                    break;
                }else{
                    if(matrix[i+result][index]=='0'){
                        flag=false;
                        break;
                    }
                }
            } 
        }
        return flag;
    }
}
