package com.algorithms.trees;

/**
 * To Print the Left View of the Binary Tree, we need to print the leftmost node at every level of the Binary Tree.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class PrintLeftViewOfBinaryTree {

    private static int visitedLevel = 0;

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        int currentLevel = 1;
        printLeft(root,currentLevel);
    }

    private static void printLeft(Node root, int currentLevel) {

        if (root == null)
            return;

        if(visitedLevel < currentLevel){
            System.out.println(root.key);
            visitedLevel = currentLevel;
        }
        printLeft(root.left, currentLevel +1);
        printLeft(root.right, currentLevel +1);

    }
}
