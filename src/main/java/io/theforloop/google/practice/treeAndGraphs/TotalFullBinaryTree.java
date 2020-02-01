package io.theforloop.google.practice.treeAndGraphs;

import io.theforloop.google.practice.common.BNode;
import io.theforloop.google.practice.common.Data;
import io.theforloop.google.practice.utils.BTreeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shubham
 */

/*
* Print all full binary treeAndGraphs with n nodes
* https://leetcode.com/problems/all-possible-full-binary-trees/
*/

public class TotalFullBinaryTree {

    public List<BNode> getAllFullBinaryTreesOfNNodes(int n){
        if(n<=0 || (n&1) == 0){
            return new ArrayList<>();
        }
        BNode root = new BNode(new Data(1));
        List<BNode> roots = new ArrayList<>();
        roots.add(root);
        if(n==1){
            return roots;
        }
        Map<Integer,List<BNode>> rootsMap = new HashMap<>();
        rootsMap.put(1,roots);
        for(int i = 3;i<=n;i+=2){
            roots = new ArrayList<>();
            for(int j=1,k=i-2; j<=i-2 && k>=1; j+=2,k-=2){
                List<BNode> leftTrees = rootsMap.get(j);
                List<BNode> rightTrees = rootsMap.get(k);
                for(BNode lNode:leftTrees){
                    for(BNode rNode:rightTrees){
                        root = new BNode(new Data(i));
                        BNode cLNode = BTreeUtils.copyBinaryTree(lNode);
                        BNode cRNode = BTreeUtils.copyBinaryTree(rNode);
                        root.setLeft(cLNode);
                        root.setRight(cRNode);
                        roots.add(root);
                    }
                }
            }
            rootsMap.put(i,roots);
        }
        return rootsMap.get(n);
    }


}
