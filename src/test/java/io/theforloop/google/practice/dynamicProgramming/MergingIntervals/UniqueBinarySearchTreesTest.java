package io.theforloop.google.practice.dynamicProgramming.MergingIntervals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class UniqueBinarySearchTreesTest {

    @Test
    public void numTrees() {
        int input = 3;
        int exp = 5;
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        int res = uniqueBinarySearchTrees.numTrees(input);
        Assert.assertEquals(exp,res);
    }
}