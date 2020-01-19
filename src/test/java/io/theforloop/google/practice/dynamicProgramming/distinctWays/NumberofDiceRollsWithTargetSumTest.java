package io.theforloop.google.practice.dynamicProgramming.distinctWays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class NumberofDiceRollsWithTargetSumTest {

    @Test
    public void numRollsToTarget1() {
        int d = 1, f = 6, target = 3;
        int exp = 1;
        NumberofDiceRollsWithTargetSum numberofDiceRollsWithTargetSum = new NumberofDiceRollsWithTargetSum();
        int res = numberofDiceRollsWithTargetSum.numRollsToTarget(d,f,target);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void numRollsToTarget2() {
        int d = 2, f = 6, target = 7;
        int exp = 6;
        NumberofDiceRollsWithTargetSum numberofDiceRollsWithTargetSum = new NumberofDiceRollsWithTargetSum();
        int res = numberofDiceRollsWithTargetSum.numRollsToTarget(d,f,target);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void numRollsToTarget3() {
        int d = 2, f = 5, target = 10;
        int exp = 1;
        NumberofDiceRollsWithTargetSum numberofDiceRollsWithTargetSum = new NumberofDiceRollsWithTargetSum();
        int res = numberofDiceRollsWithTargetSum.numRollsToTarget(d,f,target);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void numRollsToTarget4() {
        int d = 1, f = 2, target = 3;
        int exp = 0;
        NumberofDiceRollsWithTargetSum numberofDiceRollsWithTargetSum = new NumberofDiceRollsWithTargetSum();
        int res = numberofDiceRollsWithTargetSum.numRollsToTarget(d,f,target);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void numRollsToTarget5() {
        int d = 30, f = 30, target = 500;
        int exp = 222616187;
        NumberofDiceRollsWithTargetSum numberofDiceRollsWithTargetSum = new NumberofDiceRollsWithTargetSum();
        int res = numberofDiceRollsWithTargetSum.numRollsToTarget(d,f,target);
        Assert.assertEquals(exp,res);
    }
}