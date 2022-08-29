package com.algorithms.recursion;

import java.util.Scanner;

/**
 * Print 1 To N Without Loop
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class Print1ToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printN(number);

    }

    private static void printN(int number) {

        if(number > 1)
            printN(number -1);
        System.out.print(number + " ");
    }
}




