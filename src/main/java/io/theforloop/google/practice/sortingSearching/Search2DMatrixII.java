package io.theforloop.google.practice.sortingSearching;

/**
 * @author Shubham
 */
public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int noOfRows = matrix.length;
        if(noOfRows == 0){
            return false;
        }
        int noOfCols = matrix[0].length;
        int row = noOfRows-1;
        int col = 0 ;
        while(col < noOfCols && row >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                row--;
            }else{
                col++;
            }
        }
        return false;
    }
}
