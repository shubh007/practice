package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MergeIntervalsTest {

    @Test
    public void merge1() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] exp = {{1,6},{8,10},{15,18}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] res = mergeIntervals.merge(intervals);
        Assert.assertEquals(exp.length,res.length);
    }
    @Test
    public void merge2() {
        int[][] intervals = {{1,4},{4,5}};
        int[][] exp = {{1,5}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] res = mergeIntervals.merge(intervals);
        Assert.assertEquals(exp.length,res.length);
    }
    @Test
    public void merge3() {
        int[][] intervals = {{1,4},{0,4}};
        int[][] exp = {{0,4}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] res = mergeIntervals.merge(intervals);
        Assert.assertEquals(exp.length,res.length);
    }
}