package com.algorithms.recursion;

import java.util.Scanner;

/**
 * Nth Fibonacci Number Using Recursion
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class NthFibonacciNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The " + number + "th Fibonacci Number is : " + fibonacci(number));

    }

    private static int fibonacci(int number) {

        if(number == 0)
            return 0;
        if(number == 1 || number == 2)
            return 1;

        return (fibonacci(number-1) + fibonacci(number-2));
    }

}
