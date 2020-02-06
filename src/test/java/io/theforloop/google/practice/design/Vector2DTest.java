package io.theforloop.google.practice.design;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void flatten2DVector1(){
        int[][] v = {{1,2},{3},{4}};
        Vector2D iterator = new Vector2D(v);
        Assert.assertEquals(1,iterator.next()); // return 1
        Assert.assertEquals(2,iterator.next()); // return 2
        Assert.assertEquals(3,iterator.next()); // return 3
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(4,iterator.next()); // return 4
        Assert.assertFalse(iterator.hasNext()); // return false
    }
    @Test
    public void flatten2DVector2(){
        int[][] v = {{1,2},{3},{4,5,6}};
        Vector2D iterator = new Vector2D(v);
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(1,iterator.next()); // return 1
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(2,iterator.next()); // return 2
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(3,iterator.next()); // return 3
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(4,iterator.next()); // return 4
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(5,iterator.next()); // return 5
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(6,iterator.next()); // return 6
        Assert.assertFalse(iterator.hasNext()); // return false
    }
    @Test
    public void flatten2DVector3(){
        int[][] v =  {{},{3}};
        Vector2D iterator = new Vector2D(v);
        Assert.assertTrue(iterator.hasNext()); // return true
        Assert.assertEquals(3,iterator.next()); // return 1
        Assert.assertFalse(iterator.hasNext()); // return false
    }

}