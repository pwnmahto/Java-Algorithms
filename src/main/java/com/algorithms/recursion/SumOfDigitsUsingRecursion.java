package com.algorithms.recursion;

/**
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class SumOfDigitsUsingRecursion {

    public static void main(String[] args) {

        int number = 123456;

        System.out.println(sumOfDigits(number));

    }

    static int sumOfDigits(int number){

        if(number == 0) return 0;

        return (number % 10 + sumOfDigits(number/10));
    }
}
