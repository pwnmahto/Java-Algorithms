package com.algorithms.strings;

/**
 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
 * such as madam or 12321 .
 * Reference from https://en.wikipedia.org/wiki/Palindrome
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class Palindrome {
    public static void main(String[] args) {
        String[] palindromes = {null, "", "abcde", "abcba", "12345", "123454321"};

        for(String s : palindromes){
            System.out.println(s + " : " + isPalindrome(s));
        }

        System.out.println("Palindrome check using Recursion");
        for(String s : palindromes){
            System.out.println(s + " : " + isPalindromeRecursion(s));
        }

        for(String s : palindromes){
            System.out.println(s + " : " + isPalindromeUsingCharAt(s));
        }
    }

    /**
     * Check if a string is a palindrome string or not.
     * @param string string to be checked.
     * @return true if the given string is palindrome.
     */
    public static boolean isPalindrome(String string) {
        if(string == null || string.length() <= 1)
            return false;

        String reverseString = new StringBuilder(string).reverse().toString();
        return string.equalsIgnoreCase(reverseString);
    }

    /**
     * Check if a string is a palindrome string or not using recursion.
     * @param string string to be checked.
     * @return true if the given string is palindrome.
     */
    public static boolean isPalindromeRecursion(String string) {
        if (string == null || string.length() <= 1)
            return false;

        if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        }

        return isPalindrome(string.substring(1, string.length() - 1));
    }

    /**
     * Check if a string is a palindrome string or not using charAt method.
     * @param string string to be checked.
     * @return true if the given string is palindrome.
     */
    public static boolean isPalindromeUsingCharAt(String string) {
        if (string == null || string.length() <= 1)
            return true;

        for (int i = 0, j = string.length() - 1; i < j; ++i, --j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
