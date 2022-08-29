package com.algorithms.arrays;

/**
 * To find the Largest Element in an Array
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class LargestElementInArray {

    public static void main(String[] args) {

        int[] numbers = {12,43,54,98,67,27,69};

        System.out.println("The largest element present in the array is : " + getLargestElement(numbers));
    }

    private static int getLargestElement(int[] numbers) {

        int largest = numbers[0];

        for(int i=1; i < numbers.length; i++){
            if(numbers[i] > largest)
                largest = numbers[i];
        }

        return largest;
    }

}
