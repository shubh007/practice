package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class RemovePalindromicSubsequencesTest {

    @Test
    public void removePalindromeSub1() {
        String s = "ababa";
        int exp = 1;
        RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();
        int res = removePalindromicSubsequences.removePalindromeSub(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void removePalindromeSub2() {
        String s = "abb";
        int exp = 2;
        RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();
        int res = removePalindromicSubsequences.removePalindromeSub(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void removePalindromeSub3() {
        String s = "baabb";
        int exp = 2;
        RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();
        int res = removePalindromicSubsequences.removePalindromeSub(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void removePalindromeSub4() {
        String s = "";
        int exp = 0;
        RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();
        int res = removePalindromicSubsequences.removePalindromeSub(s);
        Assert.assertEquals(exp,res);
    }

}