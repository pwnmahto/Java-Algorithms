package com.algorithms.recursion;

import java.util.Scanner;

/**
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class NaturalNumberSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The sum of " + number + "natural numbers is " + getNaturalNumberSum(number));
    }

    /**
     * The method uses recursion to calculate the sum  of n natural numbers.
     * @param number
     * @return
     */
   private static int getNaturalNumberSum(int number) {
        if(number == 0 || number == 1){
            return 1;
        }else{
            return number + getNaturalNumberSum(number-1);
        }
   }

}
