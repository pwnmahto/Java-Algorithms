package com.algorithms.recursion;

/**
 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
 * such as madam or 12321 .
 * Reference from https://en.wikipedia.org/wiki/Palindrome
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class PalindromeCheck {

    public static void main(String[] args) {

        String string = "madam";

        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {

        if (string == null || string.length() <= 1)
            return false;

        if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        }

        return isPalindrome(string.substring(1, string.length() - 1));
    }
}
