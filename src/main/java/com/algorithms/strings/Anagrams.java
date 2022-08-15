package com.algorithms.strings;

import java.util.Arrays;
import java.util.HashMap;

/**
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * For example, the word anagram itself can be rearranged into nag a ram,
 * also the word binary into brainy and the word adobe into abode.
 * Reference from https://en.wikipedia.org/wiki/Anagram
 */
public class Anagrams {
    public static void main(String[] args) {
        String first = "anagram";
        String second = "nag a ram";

        String str1 = first.replace(" ","");
        String str2 = second.replace(" ","");

        System.out.println(method1(str1, str2));
        System.out.println(method2(str1, str2));
    }

    /**
     * In this methodology, the strings are stored in the character arrays and both the arrays are sorted.
     * After that, both the arrays are compared for checking the anagram.
     * @param str1 First String for testing anagram.
     * @param str2 Second String for testing anagram.
     * @return true if both strings are anagrams.
     */
    static boolean method1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] c = str1.toCharArray();
            char[] d= str2.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);

            return Arrays.equals(c, d);
        }
    }

    /**
     * In this methodology, a HashMap is used to store frequencies of each characters of both strings,
     * and all the frequencies are checked iteratively.
     * @param str1 First String for testing anagram.
     * @param str2 Second String for testing anagram.
     * @return true if both strings are anagrams.
     */
   static boolean method2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        else {
            HashMap<Character, Integer> hashMap1 = new HashMap<>();
            HashMap<Character, Integer> hashMap2 = new HashMap<>();
            for (char c : str1.toCharArray()) {
                hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
            }
            for (char c : str2.toCharArray()) {
                hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
            }

            for (char c : hashMap1.keySet()) {
                if (!hashMap1.get(c).equals(hashMap2.get(c))) {
                    return false;
                }
            }
            return true;
        }
    }
}
