package io.theforloop.google.practice.dynamicProgramming.MergingIntervals;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/unique-binary-search-trees/
* */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        if(n <= 1){
            return 1;
        }
        int[] res = new int[n+1];
        res[0]=1;
        res[1]=1;
        for(int i = 2;i<=n ;i++){
            for(int j = 1 ; j<=i;j++){
                res[i] += (res[j-1]*res[i-j]);
            }
        }
        return res[n];
    }
    public int numTreesRecursive(int n) {
        int[] res = new int[n+1];
        solve(n,res);
        return res[n];
    }
    private int solve(int n,int[] res){
        if(res[n]!=0) return res[n];
        if(n==0||n==1){
            res[n] =1;
            return 1;
        }
        int r =0;
        for(int i = 1;i<=n;i++){
            r += (solve(i-1,res) * solve(n-i,res));
        }
        res[n] = r;
        return r;
    }
}
