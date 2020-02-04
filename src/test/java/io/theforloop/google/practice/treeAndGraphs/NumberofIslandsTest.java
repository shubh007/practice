package io.theforloop.google.practice.treeAndGraphs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NumberofIslandsTest {

    @Test
    public void numIslands() {
       char[][] grid =
           {{'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}};
       int exp =1;
       NumberofIslands numberofIsland = new NumberofIslands();
       int res = numberofIsland.numIslands(grid);
        Assert.assertEquals(exp,res);
    }
}