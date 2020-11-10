package com.khamurai.aodlabb2;

import static com.khamurai.aodlabb2.BubbleSort.bubbleSort;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(25);
        bt.insert(20);
        bt.insert(15);
        bt.insert(27);
        bt.insert(30);
        bt.insert(29);
        bt.insert(32);

        System.out.println("IN ORDER=======================");
        bt.printInOrder(bt.root);
        System.out.println("IN POST ORDER=======================");
        bt.printInPostOrder(bt.root);
        System.out.println("IN PRE-ORDER=======================");
        bt.printInPreOrder(bt.root);
        System.out.println("IN REVERSE ORDER=======================");
        bt.printInReverseOrder(bt.root);

        System.out.println("IN POST ORDER=======================");
        bt.printInPostOrder(bt.root);
        System.out.println("IN PRE-ORDER=======================");
        bt.printInPreOrder(bt.root);
        System.out.println("IN ORDER=======================");
        bt.printInOrder(bt.root);
        System.out.println("IN REVERSE ORDER=======================");
        bt.printInReverseOrder(bt.root);

        System.out.println("ARRAY_PRE===========================");
        int[] intArray = {3, 6, 65, 11, 5, 1};

        for(int i : intArray) {
            System.out.println(i);
        }

        bubbleSort(intArray);
        System.out.println("SORTED ARRAY===========================");
        for(int i : intArray) {
            System.out.println(i);
        }
    }
}
