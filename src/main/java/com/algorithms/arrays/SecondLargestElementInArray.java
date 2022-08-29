package com.algorithms.arrays;

/**
 * To find the Second Largest Element in an Array
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SecondLargestElementInArray {

    public static void main(String[] args) {

        int[] numbers = {12,43,54,98,67,27,69,91};

        int secondLargestIndex = getSecondLargestElement(numbers);
        System.out.println("The index of largest element present in the array is : " + secondLargestIndex);
        System.out.println("The second largest element present is : " + numbers[secondLargestIndex]);
    }

    private static int getSecondLargestElement(int[] numbers) {

        int largestIndex = 0;
        int secondLargestIndex = -1;

        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > numbers[largestIndex]){
                secondLargestIndex = largestIndex;
                largestIndex = i;
            }else if(numbers[i] < numbers[largestIndex] && numbers[i] > numbers[secondLargestIndex]){
                secondLargestIndex = i;
            }
        }
        return secondLargestIndex;
    }
}
