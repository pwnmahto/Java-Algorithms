package com.algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * To find the duplicate characters in a string.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class DuplicateCharactersInString {

    public static void main(String[] args) {

        printDuplicateCharacters("programming");

    }

    /**
     * To find the duplicate characters in a string.
     * @param input
     */
    private static void printDuplicateCharacters(String input) {

        Set<Character> set = new HashSet<>();

        char[] chars = input.toCharArray();

        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(!set.contains(c))
                set.add(c);
            else
                System.out.println(c);
        }

    }
}
