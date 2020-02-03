package io.theforloop.google.practice.lists;

import io.theforloop.google.practice.common.ListNode;

/**
 * @author Shubham
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        int carry = 0 ;
        while(l1 != null || l2 !=null || carry > 0){
            int val1 = l1!=null?l1.val:0;
            int val2 = l2!=null?l2.val:0;
            int sum = val1+val2+carry;
            carry = sum/10;
            sum = sum%10;
            if(head == null){
                head = new ListNode(sum);
                temp = head;
            }else{
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            if(l1!=null)
            l1 = l1.next;
            if(l2!=null)
            l2 = l2.next;
        }
        return head;
    }
}
