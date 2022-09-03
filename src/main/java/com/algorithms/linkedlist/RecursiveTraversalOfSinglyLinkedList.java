package com.algorithms.linkedlist;

/**
 * Recursive Traversal of Singly Linked List
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class RecursiveTraversalOfSinglyLinkedList {

    public static void main(String[] args) {

        Node head= new Node(1);
        head.next =  new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        print(head);

    }

    private static void print(Node head) {

        if(head == null)
            return;

        System.out.print(head.value + " ");

        print(head.next);

    }
}
