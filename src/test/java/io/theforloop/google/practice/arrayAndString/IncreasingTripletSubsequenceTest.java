package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class IncreasingTripletSubsequenceTest {

    @Test
    public void increasingTriplet1() {
        int[] nums = {2,1,5,0,4,6};
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        boolean res = increasingTripletSubsequence.increasingTriplet(nums);
        Assert.assertTrue(res);
    }
    @Test
    public void increasingTriplet2() {
        int[] nums = {5,4,3,2,1};
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        boolean res = increasingTripletSubsequence.increasingTriplet(nums);
        Assert.assertFalse(res);
    }
    @Test
    public void increasingTriplet3() {
        int[] nums = {1,2,3,4,5};
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        boolean res = increasingTripletSubsequence.increasingTriplet(nums);
        Assert.assertTrue(res);
    }
}