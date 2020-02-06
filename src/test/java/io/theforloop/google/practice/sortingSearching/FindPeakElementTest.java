package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class FindPeakElementTest {

    @Test
    public void findPeakElement1() {
        int[] nums = {1,2,3,1};
        int exp = 2;
        FindPeakElement findPeakElement = new FindPeakElement();
        int res = findPeakElement.findPeakElement(nums);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void findPeakElement2() {
        int[] nums = {1,2,1,3,5,6,4};
        int exp = 1; //1 or 5
        FindPeakElement findPeakElement = new FindPeakElement();
        int res = findPeakElement.findPeakElement(nums);
        Assert.assertEquals(exp,res);
    }
}