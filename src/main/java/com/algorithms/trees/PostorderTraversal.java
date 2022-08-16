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
        root.right.left = new Node(40);
        root.right.right = new Node(50);

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
