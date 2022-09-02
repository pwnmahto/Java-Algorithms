package com.algorithms.binarysearchtree;

public class SearchInBinarySearchTreeRecursiveApproach {

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

        if(root == null)
            return false;
        if(root.key == element)
            return true;
        else if(root.key > element){
            return searchInBST(root.left, element);
        }else{
            return searchInBST(root.right, element);
        }

    }
}
