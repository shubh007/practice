package io.theforloop.google.practice.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class LetterCombinationsPhoneNumberTest {

    @Test
    public void letterCombinations1() {
        String digits = "23";
        String[] exp = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        LetterCombinationsPhoneNumber letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
        List<String> res = letterCombinationsPhoneNumber.letterCombinations(digits);
        Assert.assertEquals(exp.length,res.size());
    }
    @Test
    public void letterCombinations2() {
        String digits = "";
        String[] exp = {};
        LetterCombinationsPhoneNumber letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
        List<String> res = letterCombinationsPhoneNumber.letterCombinations(digits);
        Assert.assertEquals(exp.length,res.size());
    }
}