/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Arrays;

public class Solution24 {
    public static void main(String[] args) {
        UserInput prompt = new UserInput();
        Solution24 anagramChecker = new Solution24();
        boolean anagramCondition;

        //Ask for words
        prompt.askForInput();

        //Check if they are anagrams
        anagramCondition = anagramChecker.isAnagram(prompt.getWord1(), prompt.getWord2());

        //Output if they are or are not anagrams
        if(anagramCondition)
            System.out.printf("\"%s\" and \"%s\" are anagrams", prompt.getWord1(), prompt.getWord2());
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams", prompt.getWord1(), prompt.getWord2());
    }

    private boolean isAnagram(String word1, String word2) {
        // Compare string lengths and return false if not the same
        if(word1.length() != word2.length())
            return false;

        // Lowercase all characters in both words
        word1 = word1.toLowerCase();
        char[] word1Arr = word1.toCharArray();

        word2 = word2.toLowerCase();
        char[] word2Arr = word2.toCharArray();

        // Sort the strings, compare each character, and return false if not the same
        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        for(int i = 0; i < word1.length(); i++) {
            if(word1Arr[i] != word2Arr[i])
                return false;
        }
        return true;
    }
}
