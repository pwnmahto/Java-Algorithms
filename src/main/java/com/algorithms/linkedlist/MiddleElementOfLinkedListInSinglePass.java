package com.algorithms.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class MiddleElementOfLinkedListInSinglePass {

    public static void main(String[] args) {

        Node head= new Node(1);
        head.next =  new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        printMiddleElementOfLinkedList(head);
        
    }

    private static void printMiddleElementOfLinkedList(Node node) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        int count = 0;

        while (node != null){

            count++;
            int value = node.value;
            hashMap.put(count, value);

            node = node.next;

        }

        if(count % 2 == 0){
            System.out.println("The middle elements are " + hashMap.get(count/2)  + " and " + hashMap.get(count/2 + 1));
        }else
            System.out.println("The middle element are " + hashMap.get(count/2));

    }
}
