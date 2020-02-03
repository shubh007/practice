package io.theforloop.google.practice.treeAndGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreasureTruck {
    private int[] col = {0,-1,0,1};
    private int[] row = {1,0,-1,0};
    private class Node{
        int row;
        int col;
        Node(int row,int col){
            this.row = row;
            this.col = col ;
        }
    }
    private boolean isValid(List<List<Integer>> grid, boolean[][] isVisited,int rows, int columns,int currRow ,int currCol){
        return currRow>=0 && currCol >=0
            && currRow < rows && currCol < columns
            && !isVisited[currRow][currCol]
            && grid.get(currRow).get(currCol)==1;
    }
    int numberAmazonTreasureTrucks(int rows, int columns, List<List<Integer>> grid)
    {   boolean[][] isVisited = new boolean[rows][columns];
        int counter = 0 ;
        for(int row = 0 ; row < rows ; row++){
            for (int col = 0 ;col < columns ; col++){
                if(grid.get(row).get(col)==1 && !isVisited[row][col]){
                    isContiguous(grid,isVisited,rows,columns,row,col);
                    counter++;
                }
            }
        }
        return counter;
    }
    private void isContiguous(List<List<Integer>> grid,boolean[][] isVisited,int rows, int columns,int currRow, int currCol){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(currRow,currCol));
        isVisited[currRow][currCol] = true;
        while (!queue.isEmpty()){
            Node currNode = queue.poll();
            for(int direction = 0 ; direction < 4 ; direction++){
                int nextRow = currNode.row+row[direction];
                int nextCol = currNode.col+col[direction];
                if(isValid(grid,isVisited,rows,columns,nextRow,nextCol)){
                    queue.add(new Node(nextRow,nextCol));
                    isVisited[nextRow][nextCol] =true;
                }
            }
        }
    }

}
