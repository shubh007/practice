package io.theforloop.google.practice.dynamicProgramming.distinctWays;

/**
 * @author Shubham
 */
/*
*https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
*
* */
public class NumberofDiceRollsWithTargetSum {
    public int numRollsToTarget(int d, int f, int target) {
        int[][] res = new int[d+1][target+1];
        int mod = 1000000007;
        res[0][0] = 1;
        for(int i = 1 ; i <= d; i++){
            for(int j = 1 ; j <= target ; j++ ){
                for(int k = 1 ; k <= f ; k++){
                    if(j>=k){
                        if((mod-res[i][j]) <= res[i-1][j-k]){
                            res[i][j] = (res[i][j] + res[i-1][j-k]) % mod;
                        }else{
                            res[i][j]  += res[i-1][j-k];
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        return res[d][target];
    }
}
