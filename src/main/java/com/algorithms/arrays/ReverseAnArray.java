package com.algorithms.arrays;

import java.util.Arrays;

/**
 * To reverse an Array
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class ReverseAnArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 7, 30};

        System.out.println("The original array is : " + Arrays.toString(numbers));

        System.out.println("The reversed array is : " + Arrays.toString(reverseArray(numbers)));

    }

    private static int[] reverseArray(int[] numbers) {

        int length = numbers.length;
        for(int i=0; i< length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[length-i-1];
            numbers[length-i-1] = temp;
        }
        return numbers;
    }
}
