package com.algorithms.trees;

/**
 * Children Sum Property is a property in which the sum of values of the left child
 * and right child should be equal to the value of their node if both children are present.
 * Else if only one child is present then the value of the child should be equal to its node value.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class ChildrenSumPropertyOfBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        System.out.println(isChildrenSum(root));

    }

    private static boolean isChildrenSum(Node root) {

        if(root==null)
            return true;

        if(root.left == null && root.right == null)
            return true;

        int sum=0;
        if(root.left != null)
            sum+=root.left.key;
        if(root.right != null)
            sum+=root.right.key;

        return (root.key == sum && isChildrenSum(root.left) && isChildrenSum(root.right));
    }
}
