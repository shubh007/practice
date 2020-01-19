package io.theforloop.google.practice.dynamicProgramming.distinctWays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class ClimbingStairsTest {

    @Test
    public void climbStairs1() {
        int input = 2;
        int exp = 2;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int res = climbingStairs.climbStairs(input);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void climbStairs2() {
        int input = 3;
        int exp = 3;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int res = climbingStairs.climbStairs(input);
        Assert.assertEquals(exp,res);
    }
}