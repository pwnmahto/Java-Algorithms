package com.algorithms.arrays;

/** Trapping Rain Water Problem Statement
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class TrappingRainWater {

    public static void main(String[] args) {

        int[] numbers = {12,43,54,98,67,27,69};

        System.out.println("The Maximum Water Trapped is :  " +  maximumWaterTrapped(numbers));
        
    }

    private static int maximumWaterTrapped(int[] numbers) {

        int length = numbers.length;

        int maximumWaterTrapped = 0;

        for (int i = 1; i < length - 1; i++) {

            int maxHeightLeft = numbers[i];
            for (int j = 0; j < i; j++)
                maxHeightLeft = Math.max(maxHeightLeft, numbers[j]);

            int maxHeightRight = numbers[i];
            for (int j = i + 1; j < length; j++)
                maxHeightRight = Math.max(maxHeightRight, numbers[j]);

            maximumWaterTrapped +=  Math.min(maxHeightLeft, maxHeightRight) - numbers[i];
        }

        return maximumWaterTrapped;
    }

}
