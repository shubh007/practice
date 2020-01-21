package io.theforloop.google.practice.dynamicProgramming.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome1() {
        String input = "babad";
        String exp1 = "bab";
        String exp2 = "aba";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String res = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertTrue(res.equals(exp1) || res.equals(exp2));
    }
    @Test
    public void longestPalindrome2() {
        String input = "cbbd";
        String exp1 = "bb";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String res = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals(exp1,res);
    }
    @Test
    public void longestPalindrome3() {
        String input = "abcba";
        String exp1 = "abcba";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String res = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals(exp1,res);
    }
}