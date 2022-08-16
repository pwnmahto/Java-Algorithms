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
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        System.out.println("The height of the Binary Tree is " + heightOfBinaryTree(root));
    }

    private static int heightOfBinaryTree(Node root) {
        if(root == null)
            return 0;
        else
            return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right))+1;
    }

}
