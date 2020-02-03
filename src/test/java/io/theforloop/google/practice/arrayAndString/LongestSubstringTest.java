package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring1() {
        String s = "tmmzuxt";
        int exp = 5;
        LongestSubstring longestSubstring = new LongestSubstring();
        int res = longestSubstring.lengthOfLongestSubstring(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void lengthOfLongestSubstring2() {
        String s = "abcabcbb";
        int exp = 3;
        LongestSubstring longestSubstring = new LongestSubstring();
        int res = longestSubstring.lengthOfLongestSubstring(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int exp = 3;
        LongestSubstring longestSubstring = new LongestSubstring();
        int res = longestSubstring.lengthOfLongestSubstring(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void lengthOfLongestSubstring4() {
        String s = "bbbbb";
        int exp = 1;
        LongestSubstring longestSubstring = new LongestSubstring();
        int res = longestSubstring.lengthOfLongestSubstring(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void lengthOfLongestSubstring5() {
        String s = "au";
        int exp = 2;
        LongestSubstring longestSubstring = new LongestSubstring();
        int res = longestSubstring.lengthOfLongestSubstring(s);
        Assert.assertEquals(exp,res);
    }
}