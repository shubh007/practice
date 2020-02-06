package io.theforloop.google.practice.backtracking;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class WordSearchTest {

    @Test
    public void exist1() {
        char[][] board =
                {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        String word = "ABCCED";
        WordSearch wordSearch = new WordSearch();
        boolean res = wordSearch.exist(board,word);
        Assert.assertTrue(res);
    }
    @Test
    public void exist2() {
        char[][] board =
                {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        String word = "SEE";
        WordSearch wordSearch = new WordSearch();
        boolean res = wordSearch.exist(board,word);
        Assert.assertTrue(res);
    }
    @Test
    public void exist3() {
        char[][] board =
                {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        String word = "ABCB";
        WordSearch wordSearch = new WordSearch();
        boolean res = wordSearch.exist(board,word);
        Assert.assertFalse(res);
    }
    @Test
    public void exist4() {
        char[][] board =
                {{'a','a'}};
        String word =  "aaa";
        WordSearch wordSearch = new WordSearch();
        boolean res = wordSearch.exist(board,word);
        Assert.assertFalse(res);
    }

}