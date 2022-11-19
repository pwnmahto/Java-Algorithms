package com.algorithms.searches;

public class RotatedSortedArrayUsingBinarySearch {

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] arr2 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {};
        int[] arr4 = {1};

        int element = 6;

        int result = searchElementInRotatedSortedArray(arr2, 0, arr2.length-1, element);

        System.out.println(result);
        if(result == -1){
            System.out.println("\nElement " + element + " is not present in the array.");
        }else
            System.out.println("\nElement " + element + " is present in the array at " + result);

    }

    private static int searchElementInRotatedSortedArray(int[] arr, int low, int high, int element) {
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

        //if left side is sorted
        if(arr[low] < arr[mid]){
            if(element >= arr[low] && element < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }else{
            if(element >= arr[mid+1] && element <= arr[high])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return searchElementInRotatedSortedArray(arr, low, high, element);

    }
}
