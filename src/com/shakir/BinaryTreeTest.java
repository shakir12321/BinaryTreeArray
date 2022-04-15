package com.shakir;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @org.junit.jupiter.api.Test
    void isFull() {
        BinaryTree bt2 = new BinaryTree(2);
        bt2.insert("N1");
        bt2.isFull();
        bt2.insert("N1");
        bt2.insert("N2");
        bt2.isFull();
    }

    @org.junit.jupiter.api.Test
    void insert() {
        BinaryTree bt = new BinaryTree(5);
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
//        System.out.println(bt.isFull());
//        bt.preOrder(1);
//        System.out.println(" ");
//        bt.inOrder(1);
//        System.out.println(" ");
//        bt.postOrder(1);
        System.out.println(" ");
        bt.levelOrder(1);
        bt.levelOrderArr(1);

    }
}