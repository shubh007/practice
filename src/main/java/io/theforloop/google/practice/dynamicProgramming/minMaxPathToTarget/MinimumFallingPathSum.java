package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

/**
 * @author Shubham
 */
/*
*https://leetcode.com/problems/minimum-falling-path-sum/
* */
public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        int noOfRows = A.length;
        if(noOfRows == 0){
            return 0;
        }
        int noOfCols = A[0].length;
        if(noOfCols == 0){
            return 0;
        }
        int[][] res = new int[noOfRows][noOfCols];
        int min =0;
        for(int row = 0 ; row<noOfRows;row++){
            min = Integer.MAX_VALUE;
            for(int col = 0 ; col <noOfCols;col++){
                if(row == 0){
                    res[row][col] = A[row][col];
                }else{
                    int temp = res[row-1][col];
                    if(col>0){
                        temp = Math.min(temp,res[row-1][col-1]);
                    }
                    if(col<noOfCols-1){
                        temp = Math.min(temp,res[row-1][col+1]);
                    }
                    res[row][col] = temp+A[row][col];
                }
                if(res[row][col]<min){
                    min = res[row][col];
                }
            }
        }
        return min;
    }
}
