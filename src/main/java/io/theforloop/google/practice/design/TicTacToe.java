package io.theforloop.google.practice.design;

public class TicTacToe {

    /** Initialize your data structure here. */
    private int[][] board ;
    private int n;
    public TicTacToe(int n) {
        board = new int[n][n];
        this.n = n;
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        board[row][col] = player;
        boolean rowFlag = true;
        boolean colFlag = true;
        boolean dig1Flag = true;
        boolean dig2Flag = true;
        int last = n-1;
        //check row and col
        for(int i = 0 ; i < n ; i++){
            if(board[row][i] != player){
                rowFlag = false;
            }
            if(board[i][col] != player){
                colFlag = false;
            }
            if(row != col || board[i][i] != player){
                dig1Flag = false;
            }
            if(row+col != n-1 || board[i][last] != player){
                dig2Flag = false;
            }
            last--;
            if(!colFlag && !rowFlag && !dig1Flag && !dig2Flag){
                break;
            }
        }
        if(colFlag || rowFlag || dig1Flag || dig2Flag){
            return player;
        }
        return 0;
    }
}
