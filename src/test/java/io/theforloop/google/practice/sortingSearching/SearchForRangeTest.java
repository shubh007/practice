package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class SearchForRangeTest {

    @Test
    public void searchRange1() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] exp = {3,4};
        SearchForRange searchForRange = new SearchForRange();
        int[] res = searchForRange.searchRange(nums,target);
        Assert.assertEquals(exp[0],res[0]);
        Assert.assertEquals(exp[1],res[1]);
    }
    @Test
    public void searchRange2() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] exp = {-1,-1};
        SearchForRange searchForRange = new SearchForRange();
        int[] res = searchForRange.searchRange(nums,target);
        Assert.assertEquals(exp[0],res[0]);
        Assert.assertEquals(exp[1],res[1]);
    }
    @Test
    public void searchRange3() {
        int[] nums = {};
        int target = 0;
        int[] exp = {-1,-1};
        SearchForRange searchForRange = new SearchForRange();
        int[] res = searchForRange.searchRange(nums,target);
        Assert.assertEquals(exp[0],res[0]);
        Assert.assertEquals(exp[1],res[1]);
    }
    @Test
    public void searchRange4() {
        int[] nums = {-1};
        int target = 0;
        int[] exp = {-1,-1};
        SearchForRange searchForRange = new SearchForRange();
        int[] res = searchForRange.searchRange(nums,target);
        Assert.assertEquals(exp[0],res[0]);
        Assert.assertEquals(exp[1],res[1]);
    }
}