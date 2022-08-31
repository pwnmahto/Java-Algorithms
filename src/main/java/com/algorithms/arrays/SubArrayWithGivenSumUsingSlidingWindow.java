package com.algorithms.arrays;

/**
 * Given an array of integers numbers and an integer k, return the total number of sub-arrays whose sum equals to k.
 * A sub-array is a contiguous non-empty sequence of elements within an array.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SubArrayWithGivenSumUsingSlidingWindow {

    public static void main(String[] args) {

        int[] numbers = {1, 41, 25, 4, 10, 9};

        int sum = 70;

        if(isSubArrayWithGivenSumPresent(numbers, sum))
            System.out.println("The sum "+ sum  + " is present.");
        else
            System.out.println("The sum "+ sum  + " is not present.");

    }

    private static boolean isSubArrayWithGivenSumPresent(int[] numbers, int sum) {

        boolean result = false;

        int length = numbers.length;

        int currentSum = 0;

        int leftIndex = 0;

        for(int i = 0; i < length; i++){
            currentSum += numbers[i];

            while(currentSum > sum && leftIndex < i-1){
                currentSum -= numbers[leftIndex];
                leftIndex++;
            }

            if(currentSum == sum)
                return true;
        }

        return result;

    }

}
