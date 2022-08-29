package com.algorithms.recursion;

/**
 * Power of a Number Using Recursion
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class PowerUsingRecursion {

    public static void main(String[] args) {

        System.out.println(RecursivePower(9,9));

    }

    private static int RecursivePower(int n, int p) {

        if( p== 0) return 1;

        return n * RecursivePower(n, p-1);

    }


}
