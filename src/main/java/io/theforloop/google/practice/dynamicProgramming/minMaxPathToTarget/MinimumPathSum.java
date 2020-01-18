package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/minimum-path-sum/
* */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int noOfRows = grid.length;
        if(noOfRows==0){
            return 0;
        }
        int noOfCols = grid[0].length;
        if(noOfCols==0){
            return 0;
        }
        int[][] res = new int[noOfRows][noOfCols];
        for(int row = 0 ; row<noOfRows ; row++){
            for(int col = 0 ; col<noOfCols ; col++){
                if(row > 0 && col > 0){
                    res[row][col] = Math.min(res[row-1][col],res[row][col-1])+grid[row][col];
                }else if(row > 0){
                    res[row][col] = res[row-1][col]+grid[row][col];
                }else if(col > 0){
                    res[row][col] = res[row][col-1]+grid[row][col];
                }else{
                    res[row][col] = grid[row][col];
                }
            }
        }
        return res[noOfRows-1][noOfCols-1];
    }
}
