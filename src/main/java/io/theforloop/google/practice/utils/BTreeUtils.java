package io.theforloop.google.practice.utils;

import io.theforloop.google.practice.common.BNode;

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
