package io.theforloop.google.practice.dynamicProgramming.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() {
        int[] nums = {10,9,2,5,3,7,101,18};
        int exp = 4;
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int res = longestIncreasingSubsequence.lengthOfLIS(nums);
        Assert.assertEquals(exp,res);
    }
}