package com.algorithms.dynamicprogramming;

import java.util.Arrays;

/**
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class LongestCommonSubSequence {

    static int[][] memo;

    public static void main (String[] args) {

        String s1="ABCXDRE";
        String s2="CXDZZZ";
        int m = s1.length();
        int n = s2.length();

        memo= new int[m+1][n+1];
        for(int[] i: memo)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(findLCS(s1,s2,m,n));
    }

    /**
     *  To find the longest common subsequence using memoization methodology
     * @param s1 first string
     * @param s2 second string
     * @param m  length of first string
     * @param n  length of second string
     * @return   length of the longest common subsequence present
     */
    static int findLCS(String s1, String s2, int m, int n)
    {
        if(memo[m][n]!=-1)
            return memo[m][n];

        if(m==0 || n==0){
            memo[m][n]=0;
        }else{
            if(s1.charAt(m-1)==s2.charAt(n-1))
                memo[m][n] = 1 + findLCS(s1,s2,m-1,n-1);
            else
                memo[m][n] = Math.max(findLCS(s1,s2,m-1,n), findLCS(s1,s2,m,n-1));
        }
        return memo[m][n];
    }
}
