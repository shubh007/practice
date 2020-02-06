package io.theforloop.google.practice.dynamicProgramming.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class JumpGameTest {

    @Test
    public void canJump1() {
        int[] nums = {2,3,1,1,4};
        JumpGame jumpGame = new JumpGame();
        boolean res = jumpGame.canJump(nums);
        Assert.assertTrue(res);
    }
    @Test
    public void canJump2() {
        int[] nums = {3,2,1,0,4};
        JumpGame jumpGame = new JumpGame();
        boolean res = jumpGame.canJump(nums);
        Assert.assertFalse(res);
    }
}