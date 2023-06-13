package com.Recursion;

public class powerOfANumber {
    static void power(int n,int p,int[] res){
        if(p==0){
            res[0] = 1;
            return;
        }
        power(n,p-1,res);
        res[0] *= n;
    }
    static int pow(int n,int p){
        if(p==0){
            return 1;
        }
        if(p<0){
            return 1/(n * pow(n,p-1));
        }
        return n * pow(n,p-1);
    }
    public static void main(String[] args) {
        int n = 2;
        int p = 5;
        int[] result = new int[1];
        power(n,p,result);
        System.out.println(result[0]);
        System.out.println(pow(n,p));
    }
}
