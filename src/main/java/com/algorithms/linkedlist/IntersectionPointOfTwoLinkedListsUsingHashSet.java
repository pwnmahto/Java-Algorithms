package com.algorithms.linkedlist;

import java.util.HashSet;

/**
 * To get the intersection point of two Linked Lists using HashSet
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class IntersectionPointOfTwoLinkedListsUsingHashSet {

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next =  new Node(2);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        Node head2 = new Node(11);
        head2 .next =  new Node(12);
        head2 .next.next = new Node(13);
        head2 .next.next.next = new Node(14);

        Node newNode = new Node(8);
        head1.next.next.next.next.next.next.next = newNode;
        head2 .next.next.next.next = newNode;

        Node intersectionNode = getIntersectionNode(head1, head2);
        
        if(intersectionNode != null){
            System.out.println("The intersection node is : " + intersectionNode.value);
        }else
            System.out.println("The intersection node is not present.");

    }

    /**
     * The method takes the two linked lists as input & return the intersection point
     * @param node1
     * @param node2
     * @return
     */
    private static Node getIntersectionNode(Node node1, Node node2) {

        HashSet<Node> hashSet = new HashSet<>();
        while(node1 != null || node2 != null){

            if(node1 != null){
                if(hashSet.contains(node1))
                    return node1;
                hashSet.add(node1);
                node1 = node1.next;
            }

            if(node2 != null){
                if(hashSet.contains(node2))
                    return node2;
                hashSet.add(node2);
                node2 = node2.next;
            }

        }

        return null;
    }

}
