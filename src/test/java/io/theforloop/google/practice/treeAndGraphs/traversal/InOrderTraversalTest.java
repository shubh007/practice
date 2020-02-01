package io.theforloop.google.practice.treeAndGraphs.traversal;


import io.theforloop.google.practice.common.Data;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class InOrderTraversalTest {

    @Test
    public void printRecursive1() {
        Integer[] values = {3,1,2};
        Integer[] res = {1,3,2};
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Data> result = inOrderTraversal.printRecursive(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }
    @Test
    public void printRecursive2() {
        Integer[] values = {1,2,3,4,5,6,7};
        Integer[] res = {4,2,5,1,6,3,7};
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Data> result = inOrderTraversal.printRecursive(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }
    @Test
    public void printRecursive3() {
        Integer[] values = {1,2,3,4};
        Integer[] res = {4,2,1,3};
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Data> result = inOrderTraversal.printRecursive(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }

    @Test
    public void printItirative1() {
        Integer[] values = {3,1,2};
        Integer[] res = {1,3,2};
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Data> result = inOrderTraversal.printItirative(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }
    @Test
    public void printItirative2() {
        Integer[] values = {1,2,3,4,5,6,7};
        Integer[] res = {4,2,5,1,6,3,7};
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Data> result = inOrderTraversal.printItirative(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }
    @Test
    public void printItirative3() {
        Integer[] values = {1,2,3,4};
        Integer[] res = {4,2,1,3};
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Data> result = inOrderTraversal.printItirative(values);
        Assert.assertEquals(res.length,result.size());
        for(int i = 0 ; i < res.length ; i++){
            Assert.assertEquals(res[i].intValue(),result.get(i).getInfo());
        }
    }
}