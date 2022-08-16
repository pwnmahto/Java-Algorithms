package com.algorithms.trees;

/**
 * Size of a binary tree is the sum of size of left and right sub tree and 1. It can be calculated recursively.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SizeOfBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        System.out.println("The size of the Binary Tree is " + getSizeOfBinaryTree(root));

    }

    private static int getSizeOfBinaryTree(Node root) {

        if(root == null)
            return 0;
        else
            return 1 + getSizeOfBinaryTree(root.left) + getSizeOfBinaryTree(root.right);
    }
}
