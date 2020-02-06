package io.theforloop.google.practice.backtracking;

/**
 * @author Shubham
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int noOfRows = board.length;
        if(noOfRows == 0 || word == null || word.isEmpty()){
            return false;
        }
        int noOfCols = board[0].length;
        for(int row = 0 ; row < noOfRows ; row++){
            for(int col = 0 ; col < noOfCols ; col++){
                if(word.charAt(0) == board[row][col]){
                    boolean[][] isVisited = new boolean[noOfRows][noOfCols];
                    isVisited[row][col] = true;
                    if(exploreWord(word,board,isVisited,row,col,noOfRows,noOfCols,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    private boolean exploreWord(String word,char[][] board,boolean[][] isVisited,int row,int col,int noOfRows,int noOfCols,int currIndex)     {
        if(currIndex == word.length()-1){
            return true;
        }

        for(int[] dir:directions){
            int nextRow = row+dir[0];
            int nextCol = col+dir[1];
            if(isValid(word,board,isVisited,nextRow,nextCol,noOfRows,noOfCols,currIndex+1)){
                isVisited[nextRow][nextCol] = true;
                if(exploreWord(word,board,isVisited,nextRow,nextCol,noOfRows,noOfCols,currIndex+1)){
                    return true;
                }
                isVisited[nextRow][nextCol] = false;
            }
        }
        return false;
    }
    private boolean isValid(String word,char[][] board,boolean[][] isVisited, int row,int col,int noOfRows,
                            int noOfCols,int currIndex){
        return (row>=0 && row<noOfRows && col>=0 && col<noOfCols && !isVisited[row][col] && board[row][col] == word.charAt(currIndex));
    }
}
