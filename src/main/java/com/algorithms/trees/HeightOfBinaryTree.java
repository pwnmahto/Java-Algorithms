package com.algorithms.trees;

/**
 * The height of the Binary Tree is the number of nodes between the longest path
 * from the root to a leaf node(including the root and leaf node).
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class HeightOfBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("The height of the Binary Tree is " + heightOfBinaryTree(root));
    }

    private static int heightOfBinaryTree(Node root) {
        if(root == null)
            return 0;
        else
            return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right))+1;
    }

}
