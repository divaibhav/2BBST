package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(50);
        bst.insert(10);
        bst.insert(60);
        bst.insert(40);
        bst.insert(30);
        bst.insert(70);

        bst.inOrder(bst.getRoot());
    }
}
