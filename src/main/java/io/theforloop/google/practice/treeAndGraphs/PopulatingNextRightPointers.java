package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointers {
    public TreeNode connect(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int currSize = queue.size();
            for(int count = 0 ; count < currSize ; count++ ) {
                TreeNode currNode = queue.poll();
                if(count != currSize-1){
                    currNode.next = queue.peek();
                }
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }
        return root;
    }
}
