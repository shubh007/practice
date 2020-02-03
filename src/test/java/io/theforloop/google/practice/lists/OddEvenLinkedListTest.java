package io.theforloop.google.practice.lists;

import io.theforloop.google.practice.common.Data;
import io.theforloop.google.practice.common.ListNode;
import io.theforloop.google.practice.common.Node;
import io.theforloop.google.practice.utils.ListUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class OddEvenLinkedListTest {

    @Test
    public void oddEvenList() {
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for(int i = 2 ; i <= 9 ;i++){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        int[] expList = {1,3,5,7,9,2,4,6,8};
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        ListUtils.PrintList(head);
        ListNode res = oddEvenLinkedList.oddEvenList(head);
        ListUtils.PrintList(res);
        for(int val : expList){
            Assert.assertNotEquals(null,res);
            Assert.assertEquals(val,res.val);
            res = res.next;
        }
    }
}