package io.theforloop.google.practice.utils;

import io.theforloop.google.practice.common.BNode;

import io.theforloop.google.practice.common.Data;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Shubham
 */
public class BTreeUtils {
    public static BNode copyBinaryTree(BNode bNode){
        if(bNode == null){
            return null;
        }
        BNode root = new BNode(bNode.getData());
        root.setLeft(copyBinaryTree(bNode.getLeft()));
        root.setRight(copyBinaryTree(bNode.getRight()));
        return root;
    }
    public static BNode createTreeWithArray(Integer[] values){
        if(values.length==0){
            return null;
        }
        BNode root = new BNode(new Data(values[0]));
        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);
        Integer index = 1 ;
        while (index<values.length && !queue.isEmpty()){
            BNode curr = queue.poll();
            if(values[index]!=null){
                BNode left = new BNode(new Data(values[index]));
                queue.add(left);
                curr.setLeft(left);
            }
            if(index<values.length-1 && values[index+1]!=null){
                BNode right = new BNode(new Data(values[index+1]));
                queue.add(right);
                curr.setRight(right);
            }
            index += 2;
        }
        return root;
    }

    //Level Order Traversal
    public static void printBinaryTree(BNode root){
        if(root == null){
            return;
        }
        Queue<BNode> bNodeQueue = new LinkedList<>();
        bNodeQueue.add(root);
        while (!bNodeQueue.isEmpty()){
            int levelSize = bNodeQueue.size();
            for(int i = 0 ; i <levelSize;i++){
                BNode curr = bNodeQueue.poll();
                if(curr == null){
                    return;
                }
                boolean hasChildren = false;
                if(curr.getLeft()!=null) {
                    hasChildren = true;
                    bNodeQueue.add(curr.getLeft());
                }
                if(curr.getRight()!=null) {
                    hasChildren=true;
                    bNodeQueue.add(curr.getRight());
                }
                System.out.print("{"+curr.getData().getInfo() + "," + hasChildren+"}");
            }
            System.out.println();
        }
    }

}
