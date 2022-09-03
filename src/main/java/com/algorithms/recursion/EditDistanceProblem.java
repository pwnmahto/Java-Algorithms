package com.algorithms.recursion;

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

        if(m == 0)
            return n;

        if(n == 0)
            return m;

        if(word1.charAt(m-1) == word2.charAt(n-1)){
            return minimumNumber0fOperations(word1, word2, m-1,n-1);
        }else{
            int insert = minimumNumber0fOperations(word1, word2, m, n-1);
            int delete = minimumNumber0fOperations(word1, word2, m-1, n);
            int replace =  minimumNumber0fOperations(word1, word2, m-1, n-1);

            return 1 + Math.min(insert, Math.min(delete, replace));
        }

    }
}
