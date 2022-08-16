package com.algorithms.trees;

/**
 * The preorder traversal technique follows the Root Left Right policy.
 * The name preorder itself suggests that the root node would be traversed first.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class PreorderTraversal {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        preOrder(root);
    }

    private static void preOrder(Node root) {
        if(root != null){
            System.out.println(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
