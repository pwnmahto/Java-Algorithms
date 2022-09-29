package com.algorithms.arrays;

/**
 * To find the sum of the contiguous sub array within an arr[] with the largest sum.
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
        int maxSum = numbers[0];

        if(length == 0){
            System.out.println("This is an empty array.");
            return;
        }

        if(length == 1){
            System.out.println("This maximum sum of the array is " + maxSum + " is present at index 0.");
            return;
        }

        for(int i = 1; i < length; i++){

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
