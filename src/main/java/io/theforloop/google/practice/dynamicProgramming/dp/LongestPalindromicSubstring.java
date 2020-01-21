package io.theforloop.google.practice.dynamicProgramming.dp;

/**
 * @author Shubham
 */
/**
 *
 * https://leetcode.com/explore/featured/card/google/64/dynamic-programming-4/451/
 * */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s==null || s.length() == 0){
            return s;
        }
        int max = 1 ;
        int[] indeces = {0,0};
        int len = s.length();

        boolean[][] dp = new boolean[len][len];
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len-i ; j++){
                int k = j+i;
                if(i==0){
                    dp[j][k]=true;
                }else {
                    dp[j][k] = (s.charAt(j) == s.charAt(k));
                    if(i>1){
                        dp[j][k] =  dp[j][k] &&  dp[j+1][k-1];
                    }
                }
                if(dp[j][k] && max < (i+1)){
                    max = i+1;
                    indeces[0] = j;
                    indeces[1] = k;
                }
            }
        }
        return s.substring(indeces[0],indeces[1]+1);
    }
}
