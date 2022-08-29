package com.algorithms.recursion;

import java.util.Scanner;

/**
 * Digital Root of a Number
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class FindDigitalRoot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        digitalRoot(number);
    }

    private static void digitalRoot(int n) {

        int sumOfDigits = getSumOfDigits(n);
        while( sumOfDigits > 9){
            sumOfDigits = getSumOfDigits(sumOfDigits);
        }
        System.out.println(sumOfDigits);

    }

    private static int getSumOfDigits(int n) {

        if(n==0) return 0;

        return (n%10  + getSumOfDigits(n/10));
    }
}
