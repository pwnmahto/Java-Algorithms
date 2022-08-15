package com.algorithms.dynamicprogramming;

import java.util.Arrays;

/**
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class CoinChangeProblem {

    public static void main(String args[]){
        int amount = 5;
        int[] coins = {1,2,5};

        int minimumCoins[] = new int[amount+1];
        Arrays.fill(minimumCoins, -1);
        minimumCoins[0] = 0;

        System.out.println("Minimum number of coins required for amount :"
                + amount
                + " is: "
                + minimumCoins(coins, amount, minimumCoins));
    }


    /**
     * This method finds the minimum number of coins required for a given amount.
     *
     * @param coins
     * @param amount
     * @pa
     */

    /**
     *
     * @param coins The list of unique coins.
     * @param amount The amount for which we need to find the minimum number of coins.
     * @param minimumCoins The minimumCoins[i] will store the minimum coins needed for amount i.
     * @return The number of minimum coins needed for a particular amount.
     */
    private static int minimumCoins(int[] coins, int amount, int[] minimumCoins) {

        if(amount == 0) return 0;

        int answer = Integer.MAX_VALUE;

        for(int i = 0; i<coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int subAnswer = 0;
                if (minimumCoins[amount - coins[i]] != -1) {
                    subAnswer = minimumCoins[amount - coins[i]];
                } else {
                    subAnswer = minimumCoins(coins, amount - coins[i], minimumCoins);
                }
                if (subAnswer != Integer.MAX_VALUE &&
                        subAnswer + 1 < answer) {
                    answer = subAnswer + 1;
                }
            }
        }

        return minimumCoins[amount] = answer;
    }
}
