package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

import io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget.MinimumFallingPathSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Shubham
 */
public class MinimumFallingPathSumTest {

    @Test
    public void minFallingPathSum() {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int exp = 12;
        MinimumFallingPathSum minimumFallingPathSum = new MinimumFallingPathSum();
        int res = minimumFallingPathSum.minFallingPathSum(grid);
        Assert.assertEquals(exp,res);
    }
}