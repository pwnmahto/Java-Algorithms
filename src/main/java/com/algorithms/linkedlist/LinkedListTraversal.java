package com.algorithms.linkedlist;

/**
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class LinkedListTraversal {

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

        Node currentNode = head;

        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }


}

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        next = null;
    }
}
