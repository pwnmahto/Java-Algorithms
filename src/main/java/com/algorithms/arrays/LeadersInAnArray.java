package com.algorithms.arrays;

/**
 * A leader in an array is an element which is greater than all the elements on its right side in the array.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class LeadersInAnArray {

    public static void main(String[] args) {

        int[] numbers = {12,99,54,98,67,27,69};

        findLeaders(numbers);

    }

    private static void findLeaders(int[] numbers) {

        int length = numbers.length;
        int tempIndex = length-1;

        System.out.println(numbers[tempIndex]); // The right most element of every array is always a leader element.

        for(int i = length-2; i >= 0; i--){
            if(numbers[i] > numbers[tempIndex]){
                System.out.println(numbers[i]);
                tempIndex = i;
            }
        }
    }
}
