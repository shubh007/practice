package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class PlusOneTest {

    @Test
    public void plusOne1() {
        int[] digits = {1,2,3};
        int[] expResult = {1,2,4};
        PlusOne plusOne = new PlusOne();
        int[] actResult = plusOne.plusOne(digits);
        Assert.assertEquals(expResult.length,actResult.length);
        for(int i = 0 ; i<expResult.length;i++) {
            Assert.assertEquals(expResult[i], actResult[i]);
        }
    }
    @Test
    public void plusOne2() {
        int[] digits = {4,3,2,1};
        int[] expResult = {4,3,2,2};
        PlusOne plusOne = new PlusOne();
        int[] actResult = plusOne.plusOne(digits);
        Assert.assertEquals(expResult.length,actResult.length);
        for(int i = 0 ; i<expResult.length;i++) {
            Assert.assertEquals(expResult[i], actResult[i]);
        }
    }
    @Test
    public void plusOne3() {
        int[] digits = {9};
        int[] expResult = {1,0};
        PlusOne plusOne = new PlusOne();
        int[] actResult = plusOne.plusOne(digits);
        Assert.assertEquals(expResult.length,actResult.length);
        for(int i = 0 ; i<expResult.length;i++) {
            Assert.assertEquals(expResult[i], actResult[i]);
        }
    }
}