package io.theforloop.google.practice.generics;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GenericAdditionTest {

    @Test
    public void add() {
        GenericAddition genericAddition = new GenericAddition();
        int input1 = 1,input2 =2;
        int exp = 3;
        String str1 = "abc"+"ert";
        String expStr = "abcert";
        double res = genericAddition.add(1,2);
        String s = genericAddition.add("adc","aa");
        Assert.assertEquals(exp, ((int) res));
    }

    @Test
    public void add1() {
    }
}