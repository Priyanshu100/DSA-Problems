package com.Recursion;

public class palindromeOrNot {
    static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        String smallString = str.substring(1);
        String smallRes = reverse(smallString);
        char fC = str.charAt(0);
        return smallRes + fC;
    }
    static boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        String rev = reverse(str);
        return (rev.equals(str));
    }
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println(isPalindrome(str.toLowerCase())?"Palindrome String":"Not a Palindrome String");
    }
}
