package com.algorithms.arrays;

/**
 * To find the Frequencies in a Sorted Array
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class FrequenciesInASortedArray {

    public static void main(String[] args) {

        int[] numbers = {10, 10, 10, 20, 30, 30, 30, 40, 40, 70, 70,90};

        printFrequencies(numbers);
    }

    private static void printFrequencies(int[] numbers) {

        int length = numbers.length;

        int frequency = 1;

        for(int i = 0; i < length-1; i++){
            if(numbers[i] == numbers[i+1]){
                frequency++;
            }else{
                System.out.println(numbers[i] + " : " + frequency);
                frequency =1;
            }
        }
        System.out.println(numbers[length-1] + " : " + frequency);
    }
}
