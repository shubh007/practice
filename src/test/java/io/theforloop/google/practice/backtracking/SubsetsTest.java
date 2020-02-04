package io.theforloop.google.practice.backtracking;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SubsetsTest {

    @Test
    public void subsets() {
        int[] nums = {1,2,3};
        int expSize = 8;
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(nums);
        Assert.assertEquals(expSize,result.size());
    }
}