package com.Recursion;

import java.util.Arrays;

public class wordCapitalizer {
    public static String[] capitalizeWords(String[] words) {
        String[] capitalizedWords = new String[words.length];
        return capitalizeWords(words, capitalizedWords, 0);
    }

    private static String[] capitalizeWords(String[] words, String[] capitalizedWords, int index) {
        if (index >= words.length) {
            return capitalizedWords; // Base case: reached the end of the array
        }

        String word = words[index];
        String capitalizedWord = word.toUpperCase();

        capitalizedWords[index] = capitalizedWord;

        return capitalizeWords(words, capitalizedWords, index + 1);
    }

    public static void main(String[] args) {
        String[] words = {"foo", "bar", "world"};
        String[] capitalizedWords = capitalizeWords(words);
        System.out.println(Arrays.toString(capitalizedWords));
    }
}

