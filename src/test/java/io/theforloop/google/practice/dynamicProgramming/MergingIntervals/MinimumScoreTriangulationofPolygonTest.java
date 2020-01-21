package io.theforloop.google.practice.dynamicProgramming.MergingIntervals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MinimumScoreTriangulationofPolygonTest {

    @Test
    public void minScoreTriangulation1() {
        int[] input = {1,2,3};
        int exp = 6 ;
        MinimumScoreTriangulationofPolygon triangulationofPolygon = new MinimumScoreTriangulationofPolygon();
        int res = triangulationofPolygon.minScoreTriangulation(input);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void minScoreTriangulation2() {
        int[] input = {3,7,4,5};
        int exp = 144 ;
        MinimumScoreTriangulationofPolygon triangulationofPolygon = new MinimumScoreTriangulationofPolygon();
        int res = triangulationofPolygon.minScoreTriangulation(input);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void minScoreTriangulation3() {
        int[] input = {1,3,1,4,1,5};
        int exp = 13 ;
        MinimumScoreTriangulationofPolygon triangulationofPolygon = new MinimumScoreTriangulationofPolygon();
        int res = triangulationofPolygon.minScoreTriangulation(input);
        Assert.assertEquals(exp,res);
    }
}