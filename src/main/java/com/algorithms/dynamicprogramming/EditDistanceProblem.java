package com.algorithms.dynamicprogramming;

/**
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * The below three operations permitted on a word:
 *  1.  Insert a character
 *  2.  Delete a character
 *  3.  Replace a character
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class EditDistanceProblem {

    public static void main(String[] args) {

        String word1 = "voldemort";
        String word2 = "dumbledore";

        int m = word1.length();
        int n = word2.length();

        System.out.println("The minimum number of operations required to convert "
                + word1
                + " to "
                + word2
                + " : "
                + minimumNumber0fOperations(word1, word2, m, n));

    }

    private static int minimumNumber0fOperations(String word1, String word2, int m, int n) {

        int dp[][]= new int[m+1][n+1];

        for(int i = 0; i <= m; i++)
            dp[i][0] = i;

        for(int j = 0; j <= n; j++)
            dp[0][j] = j;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j],
                            Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }

        return dp[m][n];

    }
}
