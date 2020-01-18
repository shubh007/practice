package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

import io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget.MinimumPathSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Shubham
 */
public class MinimumPathSumTest {

    @Test
    public void minPathSum() {
        int[][] grid = {{1,3,1}, {1,5,1}, {4,2,1}};
        int expec = 7;
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int result = minimumPathSum.minPathSum(grid);
        Assert.assertEquals(expec,result);
    }
}