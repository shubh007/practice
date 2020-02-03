package io.theforloop.google.practice.treeAndGraphs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class SmallestNumberofNeighborsTest {

    @Test
    public void findTheCity1() {
        int n = 4, distanceThreshold = 4;
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int exp = 3;
        SmallestNumberofNeighbors smallestNumberofNeighbors = new SmallestNumberofNeighbors();
        int res = smallestNumberofNeighbors.findTheCity(n,edges,distanceThreshold);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void findTheCity2() {
        int n = 5, distanceThreshold = 2;
        int[][] edges = {{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        int exp = 0;
        SmallestNumberofNeighbors smallestNumberofNeighbors = new SmallestNumberofNeighbors();
        int res = smallestNumberofNeighbors.findTheCity(n,edges,distanceThreshold);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void findTheCity3() {
        int n = 6, distanceThreshold = 417;
        int[][] edges = {{0,3,7},{2,4,1},{0,1,5},{2,3,10},{1,3,6},{1,2,1}};
        int exp = 5;
        SmallestNumberofNeighbors smallestNumberofNeighbors = new SmallestNumberofNeighbors();
        int res = smallestNumberofNeighbors.findTheCity(n,edges,distanceThreshold);
        Assert.assertEquals(exp,res);
    }
}