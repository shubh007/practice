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
public class DivideAndReverseListTest {

    @Test
    public void divideOddEvenAndReverseOdd() {
        Node head = new Node(new Data(0));
        Node curr = head;
        for(int i = 1 ; i <= 5 ;i++){
            Node temp = new Node(new Data(i));
            curr.setNext(temp);
            curr = curr.getNext();
        }
        int[] evenList = {0,2,4};
        int[] oddList = {5,3,1};
        DivideAndReverseList divideAndReverseList = new DivideAndReverseList();
        List<Node> result = divideAndReverseList.DivideOddEvenAndReverseOdd(head);
        Assert.assertEquals(2,result.size());
        Node evenHead = result.get(0);
        for(int val : evenList){
            Assert.assertNotEquals(null,evenHead);
            Assert.assertEquals(val,evenHead.getData().getInfo());
            evenHead = evenHead.getNext();
        }
        Node oddHead = result.get(1);
        for(int val : oddList){
            Assert.assertNotEquals(null,oddHead);
            Assert.assertEquals(val,oddHead.getData().getInfo());
            oddHead = oddHead.getNext();
        }
        ListUtils.PrintList(head);
        ListUtils.PrintList(result.get(0));
        ListUtils.PrintList(result.get(1));
    }
}