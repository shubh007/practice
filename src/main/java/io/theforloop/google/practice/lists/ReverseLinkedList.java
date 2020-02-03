package io.theforloop.google.practice.lists;

/**
 * @author Shubham
 */

import io.theforloop.google.practice.common.Node;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * */
public class ReverseLinkedList {
    private Node revHead = null;
    public Node reverseRecursive(Node head){
        reverse(head);
        return revHead;
    }
    private void reverse(Node currNode){
        if(currNode == null){
            return;
        }
        Node next = currNode.getNext();
        currNode.setNext(revHead);
        revHead = currNode;
        reverse(next);
    }
    public Node reverseItirative(Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node next ;
        Node currNode = head;
        while (currNode.getNext()!=null){
            next = currNode.getNext();
            currNode.setNext(prev);
            prev = currNode;
            currNode = next;
        }
        currNode.setNext(prev);
        return currNode;
    }
}
