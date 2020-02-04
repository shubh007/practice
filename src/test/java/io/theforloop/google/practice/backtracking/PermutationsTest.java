package io.theforloop.google.practice.backtracking;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PermutationsTest {

    @Test
    public void permute() {
        int[] input = {1,2,3};
        int expSize = 6;
        Permutations permutations = new Permutations();
        List<List<Integer>> result = permutations.permute(input);
        Assert.assertEquals(expSize,result.size());
    }
}