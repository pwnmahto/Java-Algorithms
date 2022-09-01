package com.algorithms.sorting;

/**
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * Reference from https://en.wikipedia.org/wiki/Insertion_sort
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {6, 2, 1, 4, 3, 5, 9, 7, 8};

        performInsertionSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    }

    private static void performInsertionSort(int[] numbers) {

        int length = numbers.length;

        for(int i = 1; i < length; i++){

            int key = numbers[i];
            int j = i-1;

            while(j>=0 && numbers[j]>key){
                numbers[j+1]=numbers[j];
                j--;
            }

            numbers[j+1]=key;
        }

    }

}
