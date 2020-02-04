package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.MatrixNode;
import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    //private boolean[][] isVisited;
    public int numIslands(char[][] grid) {
        int noOfRows = grid.length;
        if(noOfRows==0)
            return 0;
        int noOfCols = grid[0].length;
       // isVisited = new boolean[noOfRows][noOfCols];
        int noOfIslands=0;
        for(int row = 0 ; row < noOfRows ;row++){
            for(int col = 0 ; col < noOfCols ;col++){
                if(grid[row][col] =='1' /*&& !isVisited[row][col]*/){
                    noOfIslands++;
                    exploreIsland(grid,row,col,noOfRows,noOfCols);
                }
            }
        }
        return noOfIslands;
    }
    private void exploreIsland(char[][] grid,int row,int col,int noOfRows,int noOfCols){
        Queue<MatrixNode> queue = new LinkedList<>();
        queue.add(new MatrixNode(row,col));
        //isVisited[row][col] = true;
        grid[row][col] = '0';
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            MatrixNode currNode = queue.poll();
            for(int[] dir:directions){
                int nextRow = currNode.x+dir[0];
                int nextCol = currNode.y+dir[1];
                if(isValid(grid,noOfRows,noOfCols,nextRow,nextCol)){
                   // isVisited[nextRow][nextCol] = true;
                    grid[nextRow][nextCol] = '0';
                    queue.add(new MatrixNode(nextRow,nextCol));
                }
            }
        }
    }
    private boolean isValid(char[][] grid,int n,int m,int x,int y){
        return (x>=0 && x<n && y>=0 && y<m && grid[x][y]=='1' /*&& !isVisited[x][y]*/);
    }
}
