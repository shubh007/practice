package io.theforloop.google.practice.lists;

import io.theforloop.google.practice.common.ListNode;

/**
 * @author Shubham
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode oddHead = head ;
        ListNode evenHead = head.next ;
        ListNode nextEven = head.next ;
        while( nextEven !=null && nextEven.next != null){
            ListNode nextOdd = nextEven.next;
            oddHead.next = nextOdd;
            nextEven.next = nextOdd.next;
            oddHead = oddHead.next;
            oddHead.next = evenHead;
            nextEven = nextEven.next;
        }
        return head;
    }
}
