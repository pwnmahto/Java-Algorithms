package com.algorithms.sorting;

/**
 * Selection sort is an in-place comparison sorting algorithm. It has an O(n2) time complexity,
 * which makes it inefficient on large lists, and generally performs worse than the similar insertion sort.
 * Selection sort is noted for its simplicity and has performance advantages over more complicated algorithms in certain situations,
 * particularly where auxiliary memory is limited.
 * Reference from https://en.wikipedia.org/wiki/Selection_sort
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {6, 2, 1, 4, 3, 5, 9, 7, 8};

        performSelectionSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    }

    private static void performSelectionSort(int[] numbers) {

        int length = numbers.length;

        for(int i = 0; i < length; i++){

            int minIndex = i;

            for(int j = i; j < length; j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }

    }

}
