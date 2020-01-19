package io.theforloop.google.practice.dynamicProgramming.distinctWays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class TargetSumTest {

    @Test
    public void findTargetSumWaysRecursive1() {
        int[] nums = {1, 1, 1, 1, 1};
        int S = 3;
        int exp = 5;
        TargetSum targetSum = new TargetSum();
        int res = targetSum.findTargetSumWaysRecursive(nums,S);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void findTargetSumWaysRecursive2() {
        int[] nums = {1};
        int S = 2;
        int exp = 0;
        TargetSum targetSum = new TargetSum();
        int res = targetSum.findTargetSumWaysRecursive(nums,S);
        Assert.assertEquals(exp,res);
    }
   @Test
    public void findTargetSumWays1() {
        int[] nums = {1, 1, 1, 1, 1};
        int S = 3;
        int exp = 5;
        TargetSum targetSum = new TargetSum();
        int res = targetSum.findTargetSumWays(nums,S);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void findTargetSumWays2() {
        int[] nums = {1};
        int S = 2;
        int exp = 0;
        TargetSum targetSum = new TargetSum();
        int res = targetSum.findTargetSumWays(nums,S);
        Assert.assertEquals(exp,res);
    }
}