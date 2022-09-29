package com.algorithms.linkedlist;

/**
 * To get the intersection point of two Linked Lists using difference in Node count
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class IntersectionPointOfTwoLinkedListsUsingDiffInNodeCount {

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

        int count1 = getNodeCount(head1);
        int count2 = getNodeCount(head2);
        int difference;

        Node intersectionNode = null;
        if(count1 > count2){
            difference = count1 - count2;
            intersectionNode = getIntersectionNode(difference, head1, head2);
        }else {
            difference = count2 - count1;
            intersectionNode = getIntersectionNode(difference, head2, head1);
        }

        if(intersectionNode != null){
            System.out.println("The intersection node is : " + intersectionNode.value);
        }else
            System.out.println("The intersection node is not present.");

    }

    /**
     * To get the intersection point of the two linked lists.
     * @param difference
     * @param node1
     * @param node2
     * @return
     */
    private static Node getIntersectionNode(int difference, Node node1, Node node2) {

        Node currentNode1 = node1;
        Node currentNode2 = node2;

        for(int i = 0; i < difference; i++){
            if(currentNode1 == null){
                return null;
            }
            currentNode1 = currentNode1.next;
        }

        while (currentNode1 != null && currentNode2 != null){

            if(currentNode1 == currentNode2){
                return currentNode1;
            }

            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;

        }
        return null;
    }

    /**
     * To get the total number of nodes present in the Linked List.
     * @param node
     * @return total number of nodes
     */
    private static int getNodeCount(Node node){

        Node tempNode = node;

        int count = 0;

        while (tempNode != null){
            count++;
            tempNode = tempNode.next;
        }

        return count;

    }
}
