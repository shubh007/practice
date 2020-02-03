package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MissingRangesTest {

    @Test
    public void findMissingRanges1() {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0 , upper = 99;
        String[] exp = {"2", "4->49", "51->74", "76->99"};
        MissingRanges missingRanges = new MissingRanges();
        List<String> res = missingRanges.findMissingRanges(nums,lower,upper);
        Assert.assertEquals(exp.length,res.size());
        for(int i = 0 ; i < exp.length ; i++){
            Assert.assertEquals(exp[i],res.get(i));
        }
    }
    @Test
    public void findMissingRanges2() {
        int[] nums = {-2147483648,-2147483648,0,2147483647,2147483647};
        int lower = -2147483648 , upper = 2147483647;
        String[] exp = {"-2147483647->-1","1->2147483646"};
        MissingRanges missingRanges = new MissingRanges();
        List<String> res = missingRanges.findMissingRanges(nums,lower,upper);
        Assert.assertEquals(exp.length,res.size());
        for(int i = 0 ; i < exp.length ; i++){
            Assert.assertEquals(exp[i],res.get(i));
        }
    }
}