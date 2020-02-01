package io.theforloop.google.practice.treeAndGraphs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class DecodeStringTest {

    @Test
    public void decodeString1() {
        String s = "3[a]2[bc]";
        String exp = "aaabcbc";
        DecodeString decodeString = new DecodeString();
        String res = decodeString.decodeString(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void decodeString2() {
        String s = "3[a2[c]]";
        String exp = "accaccacc";
        DecodeString decodeString = new DecodeString();
        String res = decodeString.decodeString(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void decodeString3() {
        String s = "2[abc]3[cd]ef";
        String exp = "abcabccdcdcdef";
        DecodeString decodeString = new DecodeString();
        String res = decodeString.decodeString(s);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void decodeString4() {
        String s = "bb3[a2[c]]2[abc]df";
        String exp = "bbaccaccaccabcabcdf";
        DecodeString decodeString = new DecodeString();
        String res = decodeString.decodeString(s);
        Assert.assertEquals(exp,res);
    }
}