package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham
 */
public class BinaryTreefromPreorderandInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return partitionAndGetRoot(inorder,0,len-1,preorder,0,len-1);
    }
    private TreeNode partitionAndGetRoot(int[] inOrder , int inOrderStart, int inOrderEnd, int[] preOrder, int preOrderStart, int size){
        if(inOrderStart>inOrderEnd){
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int index = inOrderStart; index <= inOrderEnd ; index++ ){
            map.put(inOrder[index],index);
        }
        int rootIndex = 0 ;
        int index  ;
        for( index = preOrderStart ; index <= size ; index++){
            if(map.containsKey(preOrder[index])){
                rootIndex = map.get(preOrder[index]);
                break;
            }
        }
        TreeNode root = new TreeNode(inOrder[rootIndex]);
        root.left = partitionAndGetRoot(inOrder,inOrderStart,rootIndex-1,preOrder,index,size);
        root.right = partitionAndGetRoot(inOrder,rootIndex+1,inOrderEnd,preOrder,index,size);
        return root;
    }
}
