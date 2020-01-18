package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/min-cost-climbing-stairs/
* */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len==0){
            return 0;
        }
        int[] minCosts =  new int[len];
        minCosts[0] = cost[0];
        if(len>1){
            minCosts[1] = cost[1];
        }
        for(int i = 2; i <len;i++) {
            minCosts[i] = Math.min(minCosts[i - 1], minCosts[i - 2]) + cost[i];
        }
        return Math.min(minCosts[len - 1], minCosts[len - 2]);
    }
}
