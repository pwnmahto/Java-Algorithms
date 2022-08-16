package com.algorithms.trees;

/**
 * Nodes at distance k from the root are basically the nodes at (k+1)th level of the Binary Tree.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class KthNodesFromRootInBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        int k = 2;
        printKthNodesInBinaryTree(root,k);
    }

    private static void printKthNodesInBinaryTree(Node root, int k) {

        if(root==null) return;

        if(k==0){
            System.out.print(root.key+" ");
        }
        else{
            printKthNodesInBinaryTree(root.left,k-1);
            printKthNodesInBinaryTree(root.right,k-1);
        }
    }
}
