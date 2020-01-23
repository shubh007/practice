package io.theforloop.google.practice.tree.traversal;

import static org.junit.Assert.*;

import io.theforloop.google.practice.common.Data;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PreOrderTraversalTest {

    @Test
    public void printRecursive() {
        Integer[] values = {3,1,2};
        Integer[] res = {3,1,2};
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        List<Data> result = preOrderTraversal.printRecursive(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }

    @Test
    public void printItirative() {
        Integer[] values = {3,1,2};
        Integer[] res = {3,1,2};
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        List<Data> result = preOrderTraversal.printItirative(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }
}