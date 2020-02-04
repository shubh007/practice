package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.TreeNode;

public class InorderSuccessorinBST {
    private boolean isSuccessor = false;
    private TreeNode res = null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inOrder(root,p);
        return res;
    }
    private void inOrder(TreeNode root,TreeNode p){
        if(root==null){
            return ;
        }
        inOrder(root.left,p);
        if(isSuccessor){
            res = root;
            isSuccessor = false;
            return;
        }
        if(p == root){
            isSuccessor = true;
            //   System.out.println("p Value : "+p.val + "root Value : "+root.val);
        }
        // System.out.println("Value : "+root.val + " isSuccessor : "+isSuccessor);
        inOrder(root.right,p);
    }
}
