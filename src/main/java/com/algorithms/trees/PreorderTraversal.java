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
        root.right.left = new Node(40);
        root.right.right = new Node(50);

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
