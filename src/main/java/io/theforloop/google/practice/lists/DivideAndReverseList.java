package io.theforloop.google.practice.lists;

import io.theforloop.google.practice.common.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shubham
 */
/*
* Given a Linked List, turn all even-index nodes into a separate list
* and all odd-index nodes into a separate reversed list.
* */
public class DivideAndReverseList {

    public List<Node> DivideOddEvenAndReverseOdd(Node head){
        if(head == null){
            return new ArrayList<>();
        }
        Node currNode = head;
        Node evenHead = new Node(currNode.getData());
        Node currEven = evenHead;
        Node oddHead = null;
        List<Node> result = new ArrayList<>();
        result.add(evenHead);
        boolean isOdd = true;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
            if(isOdd){
                if(oddHead == null){
                    oddHead = new Node(currNode.getData());
                }else {
                    Node temp = new Node(currNode.getData());
                    temp.setNext(oddHead);
                    oddHead = temp;
                }
                isOdd = false;
            }else {
                Node temp = new Node(currNode.getData());
                currEven.setNext(temp);
                currEven = temp;
                isOdd = true;
            }

        }
        result.add(oddHead);
        return result;
    }
}
