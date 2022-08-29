package com.algorithms.recursion;

import java.util.Scanner;

/**
 * Count Total Digits in a Number
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class CountTotalDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The total number of digits present in " + number + " is : " + countDigits(number));
    }

    private static int countDigits(int number) {

        if(number/10 == 0) return 1;

        return (1 + countDigits(number/10));

    }

}