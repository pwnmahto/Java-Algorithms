package com.algorithms.strings;

/**
 * To find the character in pattern that is present at the minimum index in string.
 * @author Pawan Kumar (https://github.com/pwnmahto)
 */
public class MinimumIndexedCharacterBruteApproach {

    public static void main(String[] args) {

        String string = "Algorithms";
        String pattern = "ogsm";

        int minimumIndex = getMinimumIndexedCharacter(string, pattern);
        if(minimumIndex == -1)
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

        int m = string.length();
        int n = pattern.length();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(pattern.charAt(j) == string.charAt(i))
                    return i;
            }
        }
        return -1;
    }

}
