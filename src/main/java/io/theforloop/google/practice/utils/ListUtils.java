package io.theforloop.google.practice.utils;

import io.theforloop.google.practice.common.ListNode;
import io.theforloop.google.practice.common.Node;

/**
 * @author Shubham
 */
public class ListUtils {
    public static void PrintList(ListNode head){
        while (head != null){
            System.out.print(head.val + "  ->  ");
            head = head.next;
        }
        System.out.println();
    }
    public static void PrintList(Node head){
        while (head != null){
            System.out.print(head.getData() + "  ->  ");
            head = head.getNext();
        }
        System.out.println();
    }
    public static void PrintListArray(int[] arr){
        for (int val:arr){
            System.out.print(val + "  ->  ");
        }
        System.out.println();
    }
}
