package io.theforloop.google.practice.arrayAndString;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DiagonalTraverseTest {

    @Test
    public void findDiagonalOrder1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] excp = {1,2,4,7,5,3,6,8,9};
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[] res = diagonalTraverse.findDiagonalOrder(matrix);
        Assert.assertEquals(excp.length,res.length);
        for(int i = 0 ;i<excp.length;i++){
            Assert.assertEquals(excp[i],res[i]);
        }
    }
}