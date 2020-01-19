package io.theforloop.google.practice.dynamicProgramming.distinctWays;

/**
 * @author Shubham
 */
/*https://leetcode.com/problems/climbing-stairs/
*
* */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<=0){
            return 0;
        }
        int[] res = new int[n+1];
        res[1] = 1;
        if(n==1){
            return 1;
        }
        res[2] = 2;
        for(int i = 3 ;i<=n; i++){
            res[i] = res[i-1]+ res[i-2];
        }
        return res[n];
    }
}
