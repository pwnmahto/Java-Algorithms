package com.algorithms.trees;

/**
 * The post order traversal technique follows the Left Right Root policy.
 * Here, Left Right Root means the left subtree of the root node is traversed first,
 * then the right subtree, and finally, the root node is traversed.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class PostorderTraversal {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        postOrder(root);
    }

    private static void postOrder(Node root) {
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key + " ");
        }
    }

}
