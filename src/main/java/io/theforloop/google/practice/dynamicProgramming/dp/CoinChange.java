package io.theforloop.google.practice.dynamicProgramming.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Shubham
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount<0 || coins.length==0){
            return -1;
        }
        if(amount==0){
            return 0;
        }
        int[] results = new int[amount+1];
        Arrays.fill(results,-1);
        Set<Integer> cSet = new HashSet<>();
        for(int c:coins){
            cSet.add(c);
        }
        results[0]=0;
        for(int currAmt = 1 ; currAmt<=amount ; currAmt++){
            int minVal = currAmt+1 ;
            for(Integer coin:cSet){
                if(coin<=currAmt && results[currAmt-coin]!=-1){
                    minVal = Math.min(minVal,results[currAmt-coin]+1);
                }
            }
            results[currAmt] = minVal==currAmt+1?-1:minVal;
        }
        return results[amount];
    }
}
