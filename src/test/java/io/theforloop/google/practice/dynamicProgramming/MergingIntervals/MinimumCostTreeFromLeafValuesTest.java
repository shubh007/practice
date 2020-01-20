package io.theforloop.google.practice.dynamicProgramming.MergingIntervals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MinimumCostTreeFromLeafValuesTest {

    @Test
    public void mctFromLeafValues() {
        int[] arr = {6,2,4};
        int exp = 32;
        MinimumCostTreeFromLeafValues minimumCostTreeFromLeafValues = new MinimumCostTreeFromLeafValues();
        int res = minimumCostTreeFromLeafValues.mctFromLeafValues(arr);
        Assert.assertEquals(exp,res);
    }
}