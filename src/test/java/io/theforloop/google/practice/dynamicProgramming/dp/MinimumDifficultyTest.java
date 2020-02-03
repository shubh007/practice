package io.theforloop.google.practice.dynamicProgramming.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MinimumDifficultyTest {

    @Test
    public void minDifficulty() {
        int[] jobDifficulty = {7,1,7,1,7,1};
        int d = 3;
        int exp = 15;
        MinimumDifficulty minimumDifficulty = new MinimumDifficulty();
        int res = minimumDifficulty.minDifficulty(jobDifficulty,d);
        Assert.assertEquals(exp,res);
    }
}