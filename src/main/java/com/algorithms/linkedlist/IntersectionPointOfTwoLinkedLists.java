package com.algorithms.linkedlist;

/**
 * To get the intersection point of two Linked Lists using two loops
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class IntersectionPointOfTwoLinkedLists {

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
        System.out.println("The intersection node is : " + intersectionNode.value);

    }

    /**
     * The method takes the two linkedlists as input & return the intersection point
     * @param head1
     * @param head2
     * @return
     */
    private static Node getIntersectionNode(Node head1, Node head2) {

        while(head1 != null){

            Node tempHead2 = head2;

            while (tempHead2 != null){

                if(tempHead2 == head1)
                    return head1;

                tempHead2 = tempHead2.next;
            }

            head1 = head1.next;

        }

        return null;
    }
}
