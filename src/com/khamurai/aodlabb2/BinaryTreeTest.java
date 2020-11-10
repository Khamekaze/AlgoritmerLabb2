package com.khamurai.aodlabb2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        System.out.println("Tree in pre order: ");
        bt.printInPreOrder(bt.root);

        System.out.println("\nTree sorted:");
        bt.printInOrder(bt.root);
        assertEquals(5, bt.get(bt.root, 5).key);
    }

    @Test
    public void removeRoot() {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);

        bt.remove(8);

        assertNull(bt.root);
    }

    @Test
    public void removeChild() {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(10);
        bt.insert(9);
        bt.insert(13);
        bt.insert(2);
        bt.insert(1);
        bt.insert(5);
        bt.insert(6);
        bt.printInPreOrder(bt.root);
        System.out.println("");

        bt.remove(13);
        System.out.println("Removed 13: ");
        bt.printInPreOrder(bt.root);

        assertThrows(NullPointerException.class, () -> {bt.get(bt.root, 13);});
    }

    @Test
    public void get() {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(10);
        bt.insert(9);

        assertEquals(10, bt.get(bt.root,10).key);
    }

    @Test
    public void findMin() {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(10);
        bt.insert(9);
        bt.insert(13);
        bt.insert(2);
        bt.insert(1);
        bt.insert(5);
        bt.insert(6);

        assertEquals(1, bt.min());
    }
}
