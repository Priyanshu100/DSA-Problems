package com.Recursion;

public class sumOfTheSeries {
    static double sum(int n){
        if(n==0){
            return 0;
        }
        return n/Math.pow(n,n) + sum(n-1);

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
