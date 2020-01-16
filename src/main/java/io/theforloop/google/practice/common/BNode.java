package io.theforloop.google.practice.common;

/**
 * @author Shubham
 */
public class BNode {
    private BNode left;
    private BNode right;
    private Data data;

    public BNode(Data data) {
        this.data = data;
    }

    public BNode(BNode left, BNode right, Data data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public BNode getLeft() {
        return left;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getRight() {
        return right;
    }

    public void setRight(BNode right) {
        this.right = right;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BNode{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data.getInfo() +
                '}';
    }
}
