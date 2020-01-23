package io.theforloop.google.practice.utils;

import static org.junit.Assert.*;

import io.theforloop.google.practice.common.BNode;
import org.junit.Test;

public class BTreeUtilsTest {

    @Test
    public void createTreeWithArray() {
        Integer[] values = {1,null,2,3};
        BNode root = BTreeUtils.createTreeWithArray(values);
        BTreeUtils.printBinaryTree(root);
    }
}