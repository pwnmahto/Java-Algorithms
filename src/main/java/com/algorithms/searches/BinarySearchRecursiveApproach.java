package com.algorithms.searches;

public class BinarySearchRecursiveApproach {

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] arr2 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {};
        int[] arr4 = {1};

        int element = 6;

        int result = binarySearch(arr2, 0, arr2.length-1, element);

        if(result == -1){
            System.out.println("\nElement " + element + " is not present in the array.");
        }else
            System.out.println("\nElement " + element + " is present in the array at " + result);

    }

    private static int binarySearch(int[] arr, int low, int high, int element) {

        System.out.println();

        for(int i = 0; i < arr.length ; i++){
            if(i >= low && i <= high)
                System.out.print( arr[i] + " ");
            else
                System.out.print( "- ");
        }

        if (arr.length == 0)
            return -1;

        if (arr.length == 1)
            if(arr[0] == element)
                return 0;
            else
                return -1;

        int mid = (low + high)/2;
        System.out.print(" -----> low  = " + low);
        System.out.print(" -----> mid  = " + mid);
        System.out.print(" -----> high = " + high);

        if(element == arr[mid]){
            System.out.println("\nElement is matched at : " + mid);
            return mid;
        }

        if(element < arr[mid])
            return binarySearch(arr, low, mid-1, element);
        else
            return binarySearch(arr, mid+1, high, element);

    }

}
