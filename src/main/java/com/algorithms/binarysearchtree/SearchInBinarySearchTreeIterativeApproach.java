package com.algorithms.binarysearchtree;


/**
 * A binary search tree (BST), also called an ordered or sorted binary tree, is a rooted binary tree data structure with the key of each internal
 * node being greater than all the keys in the respective node's left subtree and less than the ones in its right subtree.
 * The time complexity of operations on the binary search tree is directly proportional to the height of the tree..
 * Reference from https://en.wikipedia.org/wiki/Binary_search_tree
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SearchInBinarySearchTreeIterativeApproach {

    public static void main(String[] args) {

        Node root = new Node(45);
        root.left = new Node(15);
        root.right = new Node(79);
        root.left.left = new Node(10);
        root.left.right = new Node(20);
        root.right.left = new Node(55);
        root.right.right = new Node(90);

        int element = 55;
        if(searchInBST(root,element))
            System.out.println(element + " is present.");
        else
            System.out.println(element + " is not present.");

        element = 155;
        if(searchInBST(root,element))
            System.out.println(element + " is present.");
        else
            System.out.println(element + " is not present.");
    }

    private static boolean searchInBST(Node root, int element) {

        while(root != null){
            if(root.key == element)
                return true;
            else if(root.key < element)
                root = root.right;
            else
                root = root.left;
        }

        return false;
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