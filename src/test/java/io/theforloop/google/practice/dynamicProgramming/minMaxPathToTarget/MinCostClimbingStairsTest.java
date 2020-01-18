package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

import io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget.MinCostClimbingStairs;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Shubham
 */
public class MinCostClimbingStairsTest {

    @Test
    public void minCostClimbingStairs1() {
        int[] cost = {10,15,20};
        int result = 15;
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int minCost = minCostClimbingStairs.minCostClimbingStairs(cost);
        Assert.assertEquals(result,minCost);
    }
    @Test
    public void minCostClimbingStairs2() {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int result = 6;
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int minCost = minCostClimbingStairs.minCostClimbingStairs(cost);
        Assert.assertEquals(result,minCost);
    }
}