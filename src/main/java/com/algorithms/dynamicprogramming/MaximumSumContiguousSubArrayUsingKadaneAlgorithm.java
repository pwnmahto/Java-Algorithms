package com.algorithms.dynamicprogramming;

/**
 * To find the sum of the contiguous sub array within an arr[] with the largest sum.
 * Some properties of this problem are:
 * 1. If the array contains all non-negative numbers, then the problem is trivial; a maximum sub-array is the entire array.
 * 2. If the array contains all non-positive numbers, then a solution is any sub-array of size 1 containing the maximal value of the array (or the empty subarray, if it is permitted).
 * 3. Several sub-arrays may have the same maximum sum.
 * Reference from https://en.wikipedia.org/wiki/Maximum_subarray_problem
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class MaximumSumContiguousSubArrayUsingKadaneAlgorithm {

    public static void main(String[] args) {

        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        getMaximumSumAndSubArray(numbers);

    }

    /**
     * To find the maximum sum of the contiguous sub array
     * @param numbers
     */
    private static void getMaximumSumAndSubArray(int[] numbers) {

        int length = numbers.length;

        int leftIndex = 0;
        int rightIndex = 0;
        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        int currentSum = numbers[0];
        int maximumSum = currentSum;

        for(int i = 1; i < length; i++){

            if(currentSum >= 0){
                currentSum += numbers[i];
            }else {
                currentSum = numbers[i];
                currentLeftIndex = i;
            }
            currentRightIndex = i;

            if(currentSum > maximumSum){
                maximumSum = currentSum;
                leftIndex = currentLeftIndex;
                rightIndex = currentRightIndex;
            }

        }

        System.out.println("This maximum sum of the array is " + maximumSum + " is present at left index : " + leftIndex + " and right index : "+ rightIndex);

    }

}
