package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
/**
 * https://leetcode.com/problems/remove-palindromic-subsequences/
 * */
public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if(s== null || s.isEmpty()){
            return 0;
        }
        int start = 0 ;
        int end = s.length()-1;
        while (start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else {
                return 2;
            }
        }
        return 1;
    }
}
