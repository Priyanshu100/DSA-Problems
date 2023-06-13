package com.Recursion;

public class sumOfNaturalNumbers {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    static void sonn(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        s = s + n;
        sonn(n-1,s);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
        sonn(n,0);
    }
}
