package com.algorithms.strings;

/**
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("abcde"));
        System.out.println(reverse2("abcde"));

    }

    /**
     * Easiest way to reverse the string str and returns it using StringBuilder reverse method.
     * @param str string to be reversed.
     * @return reversed string.
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Method to reverse a string by swapping the characters from beginning to end.
     * @param str string to be reversed.
     * @return reversed string.
     */
    public static String reverse2(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] value = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = value[i];
            value[i] = value[j];
            value[j] = temp;
        }
        return new String(value);
    }
}
