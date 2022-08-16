package com.algorithms.trees;

/**
 * Largest node(key) in a Tree is the maximum of the Tree.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class MaximumValueInBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        System.out.println("The maximum value present in the Binary Tree is " + getMaximumValueInBinaryTree(root));

    }

    private static int getMaximumValueInBinaryTree(Node root) {

        if(root == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key,Math.max(getMaximumValueInBinaryTree(root.left),getMaximumValueInBinaryTree(root.right)));
    }
}
