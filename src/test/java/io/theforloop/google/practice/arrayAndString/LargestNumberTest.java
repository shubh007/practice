package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class LargestNumberTest {

    @Test
    public void dominantIndex1() {
        LargestNumber largestNumber = new LargestNumber();
        int[] nums = {0,0,1,2};
        int index = largestNumber.dominantIndex(nums);
        Assert.assertEquals(3,index);
    }
    @Test
    public void dominantIndex2() {
        LargestNumber largestNumber = new LargestNumber();
        int[] nums = {0,0,3,2};
        int index = largestNumber.dominantIndex(nums);
        Assert.assertEquals(-1,index);
    }
    @Test
    public void dominantIndex3() {
        LargestNumber largestNumber = new LargestNumber();
        int[] nums = {1,0};
        int index = largestNumber.dominantIndex(nums);
        Assert.assertEquals(0,index);
    }
    @Test
    public void dominantIndex4() {
        LargestNumber largestNumber = new LargestNumber();
        int[] nums = {0,1};
        int index = largestNumber.dominantIndex(nums);
        Assert.assertEquals(1,index);
    }
}