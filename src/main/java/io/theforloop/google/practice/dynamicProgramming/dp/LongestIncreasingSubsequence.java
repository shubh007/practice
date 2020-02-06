package io.theforloop.google.practice.dynamicProgramming.dp;

import java.util.Arrays;

/**
 * @author Shubham
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLISBs(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] res = new int[nums.length];
        res[0]=1;
        int maxLen=1;
        for(int index = 1 ; index < nums.length ; index++){
            int j = index-1;
            int max = 1 ;
            while(j>=0){
                if(nums[j] < nums[index]){
                    max = Math.max(max,res[j]+1);
                }
                j--;
            }
            res[index] = max;
            maxLen = Math.max(maxLen,max);
        }
        return maxLen;
    }
}
