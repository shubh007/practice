package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
/*
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
 */

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int n = matrix.length;
        if(n==0){
            return new int[0];
        }
        int m = matrix[0].length;
        int[] res = new int[n*m];
        int i=0,j=0,index=0;
        boolean flag = true;
        while(i>=0 && j>=0 && i<n && j<m && index < res.length){
            res[index++] = matrix[i][j];
            if(index == res.length){
                return res;
            }
            if(flag){
                if(i==0 && j < m-1){
                    j++;
                    flag = false;
                }else if(i < n-1 && j == m-1){
                    i++;
                    flag = false;
                }else{
                    i--;
                    j++;
                }
            }else {
                if(j==0 && i < n-1){
                    i++;
                    flag = true;
                }else if(i == n-1 && j < m-1){
                    j++;
                    flag = true;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return new int[0];
    }
}
