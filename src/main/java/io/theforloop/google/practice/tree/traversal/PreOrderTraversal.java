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
* https://leetcode.com/problems/binary-tree-preorder-traversal/
* Root->Left->Right
* */
public class PreOrderTraversal {

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
        result.add(root.getData());
        printRecursive(root.getLeft(),result);
        printRecursive(root.getRight(),result);
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
        stack.push(root);
        while (!stack.empty()){
            BNode curr = stack.pop();
            result.add(curr.getData());
            if(curr.getRight()!=null) {
                stack.push(curr.getRight());
            }
            if(curr.getLeft()!=null) {
                stack.push(curr.getLeft());
            }
        }
        return result;
    }

}
