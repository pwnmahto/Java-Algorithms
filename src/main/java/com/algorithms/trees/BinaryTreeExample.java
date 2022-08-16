package com.algorithms.trees;

/**
 * A binary tree is a tree data structure in which each node has at most two children,
 * which are referred to as the left child and the right child.
 * Reference from https://en.wikipedia.org/wiki/Binary_tree
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */

public class BinaryTreeExample {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

    }
}

class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key = key;
        left = right = null;
    }
}