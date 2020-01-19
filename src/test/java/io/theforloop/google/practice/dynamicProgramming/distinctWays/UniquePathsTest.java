package io.theforloop.google.practice.dynamicProgramming.distinctWays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class UniquePathsTest {

    @Test
    public void uniquePaths1() {
        int m = 3, n = 2;
        int exp = 3;
        UniquePaths uniquePaths = new UniquePaths();
        int res = uniquePaths.uniquePaths(m,n);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void uniquePaths2() {
        int m = 7, n = 3;
        int exp = 28;
        UniquePaths uniquePaths = new UniquePaths();
        int res = uniquePaths.uniquePaths(m,n);
        Assert.assertEquals(exp,res);
    }
}