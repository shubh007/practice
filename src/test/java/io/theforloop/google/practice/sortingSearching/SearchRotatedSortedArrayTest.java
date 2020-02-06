package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class SearchRotatedSortedArrayTest {

    @Test
    public void search1() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int exp = 4;
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int res = searchRotatedSortedArray.search(nums,target);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void search2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int exp = -1;
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int res = searchRotatedSortedArray.search(nums,target);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void search3() {
        int[] nums = {1,3};
        int target = 1;
        int exp = 0;
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int res = searchRotatedSortedArray.search(nums,target);
        Assert.assertEquals(exp,res);
    }
}