package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/coin-change/
* */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] change = new int[amount+1];
        change[0] = 0;
        for(int currAmount=1; currAmount<=amount; currAmount++){
            int min = Integer.MAX_VALUE;
            for(int coin :coins){
                if(currAmount >= coin && change[currAmount-coin]!=-1){
                    min = Math.min(min,change[currAmount-coin]+1);
                }
            }
            if(min == Integer.MAX_VALUE){
                change[currAmount] = -1;
            }else{
                change[currAmount] = min;
            }
        }
        return change[amount];
    }
}
