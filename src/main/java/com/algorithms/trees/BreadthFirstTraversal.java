package com.algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level order traversal of a tree is the breadth-first traversal of a binary tree.
 * Breadth-first search (BFS) is an algorithm for searching a tree data structure for a node that satisfies a given property.
 * It starts at the tree root and explores all nodes at the present depth prior to moving on to the nodes at the next depth level.
 * Reference from https://en.wikipedia.org/wiki/Breadth-first_search
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class BreadthFirstTraversal {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        performBreadthFirstTraversal(root);

    }

    private static void performBreadthFirstTraversal(Node root) {

        if(root == null)
            return;

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            Node currentNode = nodeQueue.poll();
            System.out.println( currentNode.key + " ");
            if(currentNode.left != null)
                nodeQueue.add(currentNode.left);
            if(currentNode.right != null)
                nodeQueue.add(currentNode.right);
        }

    }

}
