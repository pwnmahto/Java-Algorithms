package com.algorithms.arrays;

/**
 * To find the sum of the contiguous sub array within an arr[] with the largest sum.
 * Some properties of this problem are:
 * 1. If the array contains all non-negative numbers, then the problem is trivial; a maximum sub-array is the entire array.
 * 2. If the array contains all non-positive numbers, then a solution is any sub-array of size 1 containing the maximal value of the array (or the empty subarray, if it is permitted).
 * 3. Several sub-arrays may have the same maximum sum.
 * Reference from https://en.wikipedia.org/wiki/Maximum_subarray_problem
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class LargestSumContiguousSubArray {

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

        int leftIndex = -1;
        int rightIndex = -1;
        int maxSum = Integer.MIN_VALUE;

        if(length == 0){
            System.out.println("This is an empty array.");
            return;
        }

        if(length == 1){
            System.out.println("This maximum sum of the array is " + numbers[0] + " is present at index 0.");
            return;
        }

        for(int i = 0; i < length; i++){

            int sum = 0;

            for(int j = i; j < length; j++){
                sum += numbers[j];
                if(sum > maxSum){
                    maxSum = sum;
                    leftIndex = i;
                    rightIndex = j;
                }
            }
            
        }

        System.out.println("This maximum sum of the array is " + maxSum + " is present at left index : " + leftIndex + " and right index : "+ rightIndex);
    }
}
