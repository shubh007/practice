package io.theforloop.google.practice.dynamicProgramming.dp;

/**
 * @author Shubham
 */
/**
 * https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
 */
public class MinimumDifficulty {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) {
            return -1;
        }
        int[][] dp = new int[d + 1][n + 1];
        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i <= d; i++) {
            for (int j = i; j + (d - i) <= n; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = j; k >= i; k--) {
                    max = Math.max(max, jobDifficulty[k - 1]);
                    if (dp[i - 1][k - 1] == Integer.MAX_VALUE)
                        continue;
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k - 1] + max);
                }
            }
        }
        for(int i = 0 ; i <= d;i++){
            for(int j = 0 ; j <= n;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[d][n];
    }
}