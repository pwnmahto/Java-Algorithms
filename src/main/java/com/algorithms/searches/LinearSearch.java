package com.algorithms.searches;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] arr2 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {};
        int[] arr4 = {1};

        int element = 6;

        int result = linearSearch(arr2, element);

        System.out.println(result);
        if(result == -1){
            System.out.println("\nElement " + element + " is not present in the array.");
        }else
            System.out.println("\nElement " + element + " is present in the array at " + result);
        

    }

    private static int linearSearch(int[] arr, int element) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] == element)
                return i;
        }

        return -1;

    }
}
