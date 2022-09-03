package com.algorithms.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Nth Fibonacci Number Using Memoization
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class NthFibonacciNumberUsingMemoization {

    static int[] memo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        memo = new int[number+1];
        Arrays.fill(memo,-1);

        System.out.println("The " + number + "th Fibonacci Number is : " + fibonacci(number));

    }

    private static int fibonacci(int number) {

        if(memo[number] == -1){

            int result;

            if(number == 0)
                return 0;
            else if(number == 1 || number == 2){
                return 1;
            }else
                result = fibonacci(number-1) + fibonacci(number-2);

            memo[number] = result;
        }

        return memo[number];
    }

}
