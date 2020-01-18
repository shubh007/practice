package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

import io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget.CoinChange;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Shubham
 */
public class CoinChangeTest {

    @Test
    public void coinChange1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int exp = 3;
        CoinChange coinChange = new CoinChange();
        int res = coinChange.coinChange(coins,amount);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void coinChange2() {
        int[] coins = {2};
        int amount = 3;
        int exp = -1;
        CoinChange coinChange = new CoinChange();
        int res = coinChange.coinChange(coins,amount);
        Assert.assertEquals(exp,res);
    }
}