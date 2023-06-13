package com.Recursion;

import javax.swing.text.EditorKit;

public class armstrongOrNot {
    static boolean isArmstrong(int n){
        int digits = countDigits(n);
        int sum = calSum(n,digits);
        return (sum == n);
    }

    static int calSum(int n, int digits) {
        if (n==0){
            return 0;
        }
        int last = n%10;
        return (int) (Math.pow(last, digits) + calSum(n/10,digits));
    }

    static int countDigits(int n) {
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n)?"Number is Armstrong":"Number is not Armstrong");
    }
}
