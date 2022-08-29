package com.algorithms.recursion;

import java.util.Scanner;

/**
 * Sum of Digits of a Number
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SumOfDigitsUsingRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(sumOfDigits(number));

    }

    static int sumOfDigits(int number){

        if(number == 0) return 0;

        return (number % 10 + sumOfDigits(number/10));
    }
}
