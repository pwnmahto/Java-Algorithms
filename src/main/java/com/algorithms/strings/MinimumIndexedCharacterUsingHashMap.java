package com.algorithms.strings;

import java.util.HashMap;

/**
 * To find the character in pattern that is present at the minimum index in string.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class MinimumIndexedCharacterUsingHashMap {

    public static void main(String[] args) {

        String string = "Algorithms";
        String pattern = "ogsm";

        int minimumIndex = getMinimumIndexedCharacter(string, pattern);
        if(minimumIndex == Integer.MAX_VALUE)
            System.out.println("No Character is found.");
        else
            System.out.println("The Minimum Indexed Character is found at : " + minimumIndex + " and the character is : " + string.charAt(minimumIndex));

    }

    /**
     * @param string
     * @param pattern
     * @return
     */
    private static int getMinimumIndexedCharacter(String string, String pattern) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        int minimumIndex = Integer.MAX_VALUE;

        int m = string.length();
        int n = pattern.length();

        for(int i = 0; i < m; i++){
            char key = string.charAt(i);
            if(!hashMap.containsKey(key))
                hashMap.put(key,i);
        }

        for(int i = 0; i < n; i++){
            if(hashMap.containsKey(pattern.charAt(i)) &&
                    hashMap.get(pattern.charAt(i)) < minimumIndex)
                minimumIndex = hashMap.get(pattern.charAt(i));
        }

        return minimumIndex;
    }

}
