package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class Search2DMatrixIITest {

    @Test
    public void searchMatrix1() {
        int[][] matrix = {{1,   4,  7, 11, 15},
                        {2,   5,  8, 12, 19},
                        {3,   6,  9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}};
        int target = 16;
        Search2DMatrixII search2DMatrixII = new Search2DMatrixII();
        boolean res = search2DMatrixII.searchMatrix(matrix,target);
        Assert.assertTrue(res);
    }
    @Test
    public void searchMatrix2() {
        int[][] matrix = {{1,   4,  7, 11, 15},
                        {2,   5,  8, 12, 19},
                        {3,   6,  9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}};
        int target = 20;
        Search2DMatrixII search2DMatrixII = new Search2DMatrixII();
        boolean res = search2DMatrixII.searchMatrix(matrix,target);
        Assert.assertFalse(res);
    }
}