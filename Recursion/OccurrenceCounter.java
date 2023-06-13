package com.Recursion;

import java.util.ArrayList;

public class OccurrenceCounter {
    public static int countOccurrences(int[] arr, int searchElement) {
        return countOccurrences(arr, searchElement, 0);
    }
    private static int countOccurrences(int[] arr, int searchElement, int index) {
        if (index == arr.length) {
            return 0; // Base case: reached end of array
        }

        int count = 0;
        if (arr[index] == searchElement) {
            count = 1;
        }
        return count + countOccurrences(arr, searchElement, index + 1);
    }


    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 2, 4, 2, 5};
        int searchElement = 2;
        int occurrences = countOccurrences(myArray, searchElement);

        System.out.println("The search element '" + searchElement + "' occurs " + occurrences + " times.");
    }
}

