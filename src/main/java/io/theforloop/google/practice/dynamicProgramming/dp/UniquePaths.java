package io.theforloop.google.practice.dynamicProgramming.dp;

/**
 * @author Shubham
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] result = new int[n][m];
        for(int row = 0 ; row < n ; row++){
            result[row][0] = 1;
        }
        for(int col = 0 ; col < m ; col++){
            result[0][col] = 1;
        }
        for(int row = 1 ; row < n ; row++){
            for(int col = 1 ; col <m;col++){
                result[row][col] = result[row-1][col]+result[row][col-1];
            }
        }
        return result[n-1][m-1];
    }
}
