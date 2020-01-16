package io.theforloop.google.practice.common;

/**
 * @author Shubham
 */
public class Data {
    private int info;

    public Data(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "{" + info + '}';
    }
}
