package io.theforloop.google.practice.design;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RandomizedSetTest {

    @Test
    public void randomizedSetTest1() {
      //  ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
//[[],[1],[2],[2],[],[1],[2],[]]
        RandomizedSet randomizedSet = new RandomizedSet();
        Assert.assertTrue(randomizedSet.insert(1));
        Assert.assertFalse(randomizedSet.remove(2));
        Assert.assertTrue(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        Assert.assertTrue(randomizedSet.remove(1));
        Assert.assertFalse(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
    @Test
    public void randomizedSetTest2() {
    // ["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
//[[],[0],[1],[0],[2],[1],[]]
        RandomizedSet randomizedSet = new RandomizedSet();
        Assert.assertTrue(randomizedSet.insert(0));
        Assert.assertTrue(randomizedSet.insert(1));
        Assert.assertTrue(randomizedSet.remove(0));
        Assert.assertTrue(randomizedSet.insert(2));
        Assert.assertTrue(randomizedSet.remove(1));
        System.out.println(randomizedSet.getRandom());
    }
    @Test
    public void randomizedSetTest3() {
    //["RandomizedSet","remove","remove","insert","getRandom","remove","insert"]
    //[[],[0],[0],[0],[],[0],[0]]
        RandomizedSet randomizedSet = new RandomizedSet();
        Assert.assertFalse(randomizedSet.remove(0));
        Assert.assertFalse(randomizedSet.remove(0));
        Assert.assertTrue(randomizedSet.insert(0));
        System.out.println(randomizedSet.getRandom());
        Assert.assertTrue(randomizedSet.remove(0));
        Assert.assertTrue(randomizedSet.insert(0));
    }
}