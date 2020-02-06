package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class TopKFrequentElementsTest {

    @Test
    public void topKFrequent() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] exp = {1,2};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        List<Integer> res = topKFrequentElements.topKFrequent(nums,k);
        Assert.assertEquals(exp.length,res.size());
    }
}