package io.theforloop.google.practice.common;

/**
 * @author Shubham
 */
public class Node {
    private Node next;
    private Data data;

    public Node(Node next, Data data) {
        this.next = next;
        this.data = data;
    }

    public Node(Data data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Data getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
