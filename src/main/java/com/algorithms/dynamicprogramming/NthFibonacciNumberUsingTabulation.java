package com.algorithms.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Nth Fibonacci Number Using Tabulation
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class NthFibonacciNumberUsingTabulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The " + number + "th Fibonacci Number is : " + fibonacci(number));

    }

    private static int fibonacci(int number) {

        int[] arr = new int[number+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= number; i++)
            arr[i] = arr[i-1] + arr[i-2];

        return arr[number];
    }

}
