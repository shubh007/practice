package io.theforloop.google.practice.lists;

import io.theforloop.google.practice.common.Data;
import io.theforloop.google.practice.common.Node;
import io.theforloop.google.practice.utils.ListUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseRecursive() {
        Node head = new Node(new Data(0));
        Node curr = head;
        for(int i = 1 ; i <= 5 ;i++){
            Node temp = new Node(new Data(i));
            curr.setNext(temp);
            curr = curr.getNext();
        }
        int[] origList = {0,1,2,3,4,5};
        int[] reverseList = {5,4,3,2,1,0};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node reverseNode = reverseLinkedList.reverseRecursive(head);
        Node currReverse = reverseNode;
        for(int val : reverseList){
            Assert.assertNotEquals(null,currReverse);
            Assert.assertEquals(val,currReverse.getData().getInfo());
            currReverse = currReverse.getNext();
        }
        ListUtils.PrintListArray(origList);
        ListUtils.PrintList(reverseNode);
    }

    @Test
    public void reverseItirative() {
        Node head = new Node(new Data(10));
        Node curr = head;

        for(int i = 11 ; i <= 15 ;i++){
            Node temp = new Node(new Data(i));
            curr.setNext(temp);
            curr = curr.getNext();
        }
        int[] origList = {10,11,12,13,14,15};
        int[] reverseList = {15,14,13,12,11,10};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node reverseNode = reverseLinkedList.reverseItirative(head);
        Node currReverse = reverseNode;
        for(int val : reverseList){
            Assert.assertNotEquals(null,currReverse);
            Assert.assertEquals(val,currReverse.getData().getInfo());
            currReverse = currReverse.getNext();
        }
        ListUtils.PrintListArray(origList);
        ListUtils.PrintList(reverseNode);
    }
}