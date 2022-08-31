package com.algorithms.arrays;

/**
 * To find the maximum consecutive 1s
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class Consecutive1sInArray {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0};

        System.out.println("The maximum consecutive count is : "+  findConsecutive1s(numbers));

    }

    private static int findConsecutive1s(int[] numbers) {

        int length = numbers.length;

        int maxCount = 0;

        int count = 0;

        for (int i = 0; i < length; i++){

            if( numbers[i] == 1){
                count++;
            }else {
                maxCount = Math.max(maxCount,count);
                count = 0;
            }

        }
        return maxCount;
    }
}
