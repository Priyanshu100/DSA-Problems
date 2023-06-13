package com.Recursion;

public class searchFromLast {
    static int search(int[] n,int element,int i){
        if(i == 0){
            return -1;
        }
        if(n[i]==element){
            return i;
        }
        return search(n,element,i-1);
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,5,6,5,7};
        int element = 5;
        System.out.println(search(n,element,n.length-1)>0?"found at index : " + search(n,element,n.length-1):"Not found");
    }
}
