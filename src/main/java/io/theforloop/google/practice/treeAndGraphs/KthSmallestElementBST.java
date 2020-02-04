package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.TreeNode;

public class KthSmallestElementBST {
    private int res =-1 ;
    private int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return res;
    }
    private void inOrder(TreeNode root,int k){
        if(root==null){
            return ;
        }
        inOrder(root.left,k);
        if(++count == k){
            res = root.val;
            return;
        }
        //System.out.println("Value : "+root.val + " count : "+count);
        inOrder(root.right,k);
    }
}
