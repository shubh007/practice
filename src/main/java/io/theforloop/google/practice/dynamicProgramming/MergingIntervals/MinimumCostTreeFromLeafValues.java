package io.theforloop.google.practice.dynamicProgramming.MergingIntervals;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/
* */
public class MinimumCostTreeFromLeafValues {
    class Result{
        int res;
        int maxMul;
        public Result(int res,int maxMul){
            this.res = res;
            this.maxMul = maxMul;
        }
    }
    Result[][] dp = null;
    public int mctFromLeafValues(int[] arr) {
        dp = new Result[arr.length][arr.length];
        return solve(arr,0,arr.length-1).res;
    }
    private Result solve(int arr[],int start,int end){
        if(dp[start][end] !=null) return dp[start][end];
        if(start == end){
            return new Result(0,arr[start]);
        }
        if(start > end){
            return new Result(0,1);
        }
        Result min = null;
        for(int i = start ; i < end ;i++){
            Result left = solve(arr,start,i);
            Result right = solve(arr,i+1,end);
            Result result = new Result((left.maxMul*right.maxMul)+
                    (left.res+right.res),Math.max(left.maxMul,right.maxMul));
            if(min == null){
                min = result;
            }else if(min.res >result.res){
                min = result;
            }
        }
        dp[start][end] = min;
        return min;
    }
}
