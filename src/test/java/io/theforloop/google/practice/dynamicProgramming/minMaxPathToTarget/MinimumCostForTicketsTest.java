package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MinimumCostForTicketsTest {

    @Test
    public void minCostTickets1() {
        int[] days  = {1,4,6,7,8,20};
        int[] cost = {2,7,15};
        int exp = 11;
        MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();
        int res = minimumCostForTickets.minCostTickets(days,cost);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void minCostTickets2() {
        int[] days  = {1,2,3,4,5,6,7,8,9,10,30,31};
        int[] cost = {2,7,15};
        int exp = 17;
        MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();
        int res = minimumCostForTickets.minCostTickets(days,cost);
        Assert.assertEquals(exp,res);
    }
}