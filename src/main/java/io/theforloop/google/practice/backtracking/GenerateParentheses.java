package io.theforloop.google.practice.backtracking;

import java.util.*;

/**
 * @author Shubham
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if(n<=0){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        allCombination(result,"",0,0,n);
        return new ArrayList<>(result);
    }
    private void allCombination(List<String> result,String currString,int open,int close,int max){
        if(currString.length() == max*2){
            result.add(currString);
            return;
        }
        if(open < max){
            allCombination(result,currString+"(",open+1,close,max);
        }
        if(close < open){
            allCombination(result,currString+")",open,close+1,max);
        }
    }
}
