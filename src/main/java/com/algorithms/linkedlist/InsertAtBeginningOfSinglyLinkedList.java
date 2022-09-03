package com.algorithms.linkedlist;

/**
 * Insert at Begin of Singly Linked List
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class InsertAtBeginningOfSinglyLinkedList {
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
        System.out.println("\n");
        head = insertAtBeginning(head,27);
        print(head);

    }

    private static Node insertAtBeginning(Node head, int value) {

        Node tempNode = new Node(value);
        tempNode.next = head;
        return tempNode;

    }

    private static void print(Node head) {

        Node currentNode = head;

        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

}
