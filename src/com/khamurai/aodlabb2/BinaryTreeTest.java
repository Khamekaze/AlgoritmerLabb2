package com.khamurai.aodlabb2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinaryTreeTest {

    @Test
    public void insert() {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(10);
        bt.insert(9);
        bt.insert(13);
        bt.insert(2);
        bt.insert(1);
        bt.insert(5);
        bt.insert(6);
        System.out.println("MIN: " + bt.min());
        bt.printInPreOrder(bt.root);
        bt.remove(8);
        System.out.println("=================");
        bt.printInPreOrder(bt.root);
        //assertEquals(5, bt.get(bt.root, 5).key);
    }

    @Test
    public void remove() {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);

        bt.remove(8);

        assertNull(bt.root);
    }
}
