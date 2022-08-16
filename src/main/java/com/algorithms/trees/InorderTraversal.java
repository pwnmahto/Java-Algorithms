package com.algorithms.trees;

/**
 * An inorder traversal technique follows the Left Root Right policy.
 * Here, Left Root Right means that the left subtree of the root node is traversed first,
 * then the root node, and then the right subtree of the root node is traversed.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class InorderTraversal {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        inOrder(root);
    }

    private static void inOrder(Node root) {
        if(root != null){
            inOrder(root.left);
            System.out.println(root.key + " ");
            inOrder(root.right);
        }
    }
}