package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.BNode;
import io.theforloop.google.practice.utils.BTreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Shubham
 */
public class TotalFullBinaryTreeTest {

    @Test
    public void getAllFullBinaryTreesOfNNodes1() {
        int n = -1;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(0,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes2() {
        int n = 0;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(0,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes3() {
        int n = 1;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(1,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes4() {
        int n = 2;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(0,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes5() {
        int n = 3;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(1,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes6() {
        int n = 4;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(0,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes7() {
        int n = 5;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(2,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes8() {
        int n = 6;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(0,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes9() {
        int n = 7;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(5,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes10() {
        int n = 8;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(0,roots.size());
    }
    @Test
    public void getAllFullBinaryTreesOfNNodes11() {
        int n = 9;
        TotalFullBinaryTree totalFullBinaryTree = new TotalFullBinaryTree();
        List<BNode> roots = totalFullBinaryTree.getAllFullBinaryTreesOfNNodes(n);
        System.out.println("Total full binary trees of "+n+" nodes : "+roots.size());
        for(BNode root:roots) {
            BTreeUtils.printBinaryTree(root);
            System.out.println();
        }
        Assert.assertEquals(14,roots.size());
    }
}