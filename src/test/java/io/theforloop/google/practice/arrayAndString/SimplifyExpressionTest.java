package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class SimplifyExpressionTest {

    @Test
    public void simplifyExpression1() {
        String inputExp = "a+b";
        String expOutput = "a+b";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
    @Test
    public void simplifyExpression2() {
        String inputExp = "-(a+b)";
        String expOutput = "-a-b";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
    @Test
    public void simplifyExpression3() {
        String inputExp = "-(-a+b)";
        String expOutput = "a-b";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
    @Test
    public void simplifyExpression4() {
        String inputExp = "+(-a+b)";
        String expOutput = "-a+b";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
    @Test
    public void simplifyExpression5() {
        String inputExp = "(-a+b)";
        String expOutput = "-a+b";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
    @Test
    public void simplifyExpression6() {
        String inputExp = "a+(-a+b)-d+t+(d+g-(d+t))";
        String expOutput = "a-a+b-d+t+d+g-d-t";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
    @Test
    public void simplifyExpression7() {
        String inputExp = "";
        String expOutput = "";
        SimplifyExpression simplifyExpression = new SimplifyExpression();
        String result = simplifyExpression.simplifyExpression(inputExp);
        Assert.assertEquals(expOutput,result);
    }
}