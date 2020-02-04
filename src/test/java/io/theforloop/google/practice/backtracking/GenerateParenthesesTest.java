package io.theforloop.google.practice.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis1() {
        int n = 0;
        String[] exp ={""};
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(n);
        Assert.assertEquals(exp.length,result.size());
    }
    @Test
    public void generateParenthesis2() {
        int n = 1;
        String[] exp ={"()"};
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(n);
        Assert.assertEquals(exp.length,result.size());
    }
    @Test
    public void generateParenthesis3() {
        int n = 2;
        String[] exp ={"(())","()()"};
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(n);
        Assert.assertEquals(exp.length,result.size());
    }
    @Test
    public void generateParenthesis4() {
        int n = 3;
        String[] exp = {"((()))","(()())","(())()","()(())","()()()"};
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(n);
        Assert.assertEquals(exp.length,result.size());
    }
    @Test
    public void generateParenthesis5() {
        int n = 4;
        String[] exp = {"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())",
                "(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"};
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(n);
        Assert.assertEquals(exp.length,result.size());
    }
}