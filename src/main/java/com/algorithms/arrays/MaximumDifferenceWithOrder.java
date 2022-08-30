package com.algorithms.arrays;

/**
 * Maximum Difference Between Increasing Elements
 * (i.e., numbers[j] - numbers[i]), such that 0 <= i < j < n and numbers[i] < numbers[j]
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class MaximumDifferenceWithOrder {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 10, 6, 4, 8, 1};

        int maxDiff = getMaximumDifference(numbers);

        if(maxDiff == -1){
            System.out.println("Maximum Difference does not exists");
        }else{
            System.out.println("Maximum Difference : "+maxDiff);
        }
    }

    private static int getMaximumDifference(int[] numbers) {

        int length = numbers.length;
        int maxDiff = numbers[1] - numbers[0];
        int minValue = numbers[0];

        for(int i = 1; i < length; i++){
            maxDiff = Math.max(maxDiff,(numbers[i])-minValue);
            minValue = Math.min(minValue,numbers[i]);
        }

        return maxDiff;
    }
}
