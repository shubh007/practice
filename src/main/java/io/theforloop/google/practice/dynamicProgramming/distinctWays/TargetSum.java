package io.theforloop.google.practice.dynamicProgramming.distinctWays;

/**
 * @author Shubham
 */

/*
*
*https://leetcode.com/problems/target-sum/
* */
public class TargetSum {
    Integer[][] res;
    int[][] res1;
    int tsum = 0 ;
    public int findTargetSumWays(int[] nums, int S) {
        for(int num:nums){
            tsum += num;
        }
        if(S>tsum || S<-tsum) return 0;
        res1 = new int[nums.length+1][tsum*2+1];
        res1[0][tsum] = 1;
        for(int i = 1 ; i<=nums.length ; i++){
            for(int j = 0 ; j < (tsum*2+1) ; j++){
                if(res1[i-1][j]!=0){
                    res1[i][j-nums[i-1]] += res1[i-1][j];
                    res1[i][j+nums[i-1]] += res1[i-1][j];
                }
            }
        }
        return res1[nums.length][S+tsum];
    }
    public int findTargetSumWaysRecursive(int[] nums, int S) {
        for(int num:nums){
            tsum += num;
        }
        res = new Integer[nums.length][tsum*2+1];
        return findTargetSumWays(nums, S,0,0);
    }
    private int findTargetSumWays(int[] nums, int S,int sum,int index){
        if (index == nums.length && sum == S) {
            return 1;
        }
        if(index == nums.length){
            return 0;
        }
        if(res[index][sum+tsum]!=null){
            return res[index][sum+tsum];
        }
        res[index][sum+tsum] = findTargetSumWays(nums,S , sum + nums[index],index+1)+
                findTargetSumWays(nums,S, sum - nums[index],index+1);
        return res[index][sum+tsum];
    }
}
