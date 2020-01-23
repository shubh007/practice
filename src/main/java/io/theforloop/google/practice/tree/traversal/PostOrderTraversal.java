package io.theforloop.google.practice.tree.traversal;

import io.theforloop.google.practice.common.BNode;
import io.theforloop.google.practice.common.Data;
import io.theforloop.google.practice.utils.BTreeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Shubham
 */
/*
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Left->Right->Root
 * */
public class PostOrderTraversal {
    public List<Data> printRecursive(Integer[] values){
        BNode root = BTreeUtils.createTreeWithArray(values);
        List<Data> result = new ArrayList<>();
        printRecursive(root,result);
        return result;
    }
    private void printRecursive(BNode root,List<Data> result){
        if(root == null){
            return;
        }
        printRecursive(root.getLeft(),result);
        printRecursive(root.getRight(),result);
        result.add(root.getData());
    }
    public List<Data> printItirative(Integer[] values){
        BNode root = BTreeUtils.createTreeWithArray(values);
        return printItirative(root);
    }
    private List<Data> printItirative(BNode root){
        List<Data> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<BNode> stack  = new Stack<>();
        
        return result;
    }

}
