package com.algorithms.sorting;


/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the input list element by element,
 * comparing the current element with the one after it, swapping their values if needed.
 * These passes through the list are repeated until no swaps had to be performed during a pass, meaning that the list has become fully sorted.
 * The algorithm, which is a comparison sort, is named for the way the larger elements "bubble" up to the top of the list.
 * Reference from https://en.wikipedia.org/wiki/Bubble_sort
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {6, 2, 1, 4, 3, 5, 9, 7, 8};

        performBubbleSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    }

    private static void performBubbleSort(int[] numbers) {

        int length = numbers.length;

        boolean swapped;

        for(int i = 0; i < length; i++){

            swapped = false;

            for(int j = 0; j < length-i-1; j++){

                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }

            }
            if(!swapped)
                break;
        }

    }
}
