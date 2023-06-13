package com.Recursion;

public class countZeroInNumber {
    static int count(int n){
        int num = 0;
        if(n==0){
            return 0;
        }
        int rem = n % 10;
        if(rem == 0)
            num++;
        num += count(n/10);
        return num;
    }
    public static void main(String[] args) {
        int n = 102030;
        System.out.println(count(n));
    }
}
