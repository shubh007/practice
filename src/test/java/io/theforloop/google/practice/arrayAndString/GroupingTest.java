package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class GroupingTest {

    @Test
    public void maxGroup1() {
        int input1 = 2;
        int[] input2 = {1,1};
        int exp = 1;
        Grouping grouping = new Grouping();
        int res = grouping.maxGroup(input1,input2);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void maxGroup2() {
        int input1 =8;
        int[] input2 = {1,2,1,1,1,1,1,1};
        int exp = 3;
        Grouping grouping = new Grouping();
        int res = grouping.maxGroup(input1,input2);
        Assert.assertEquals(exp,res);
    }
}