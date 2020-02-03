package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Shubham
 */
public class BinaryTreeZigzagLevel {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return  new ArrayList<>();
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        List<List<Integer>> result = new ArrayList<>();
        boolean flag = true;
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> row = new ArrayList<>();
            Deque<TreeNode> q1 = new ArrayDeque<>();
            for(int i = 0 ; i < len ; i++){
                TreeNode currNode ;
                if(flag){
                    currNode = q.poll();
                }else{
                    currNode = q.removeLast();
                }
                row.add(currNode.val);
                if(currNode.left != null){
                    q1.add(currNode.left);
                }
                if(currNode.right != null){
                    q1.add(currNode.right);
                }
            }
            q.addAll(q1);
            flag = !flag ;
            result.add(row);
        }
        return result;
    }
}
