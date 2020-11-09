package com.khamurai.aodlabb2;

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
        System.out.println("=======================");
        bt.remove(25);

        System.out.println("=======================");
        System.out.println("IN POST ORDER=======================");
        bt.printInPostOrder(bt.root);
        System.out.println("IN PRE-ORDER=======================");
        bt.printInPreOrder(bt.root);
        System.out.println("IN ORDER=======================");
        bt.printInOrder(bt.root);
        System.out.println("IN REVERSE ORDER=======================");
        bt.printInReverseOrder(bt.root);

        /*
        int[] intArray = {3, 6, 65, 11, 5, 1};

        for(int i : intArray) {
            System.out.println(i);
        }

        bubbleSort(intArray);

        for(int i : intArray) {
            System.out.println(i);
        }

         */


    }

    public static void bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
    }

    public static void swap (int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
