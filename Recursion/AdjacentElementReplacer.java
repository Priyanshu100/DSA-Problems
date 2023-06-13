package com.Recursion;

public class AdjacentElementReplacer {
    public static String replaceAdjacentElements(String str) {
        StringBuilder result = new StringBuilder();
        replaceAdjacentElements(str, 0, result);
        return result.toString();
    }
    static void replaceAdjacentElements(String str, int index, StringBuilder result) {
        if (index >= str.length()) {
            return; // Base case: reached the end of the string
        }

        if (index > 0 && str.charAt(index) == str.charAt(index - 1)) {
            result.append('#');
        } else {
            result.append(str.charAt(index));
        }
        replaceAdjacentElements(str, index + 1, result);
    }

    public static void main(String[] args) {
        String input = "aabbcc";
        String output = replaceAdjacentElements(input);
        System.out.println(output);
    }
}

