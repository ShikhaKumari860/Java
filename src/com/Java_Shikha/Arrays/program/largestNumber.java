package com.Java_Shikha.Arrays.program;

public class largestNumber {
    public static void main(String[] args){
        int[] a={45,23,56,68,23,98};

        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
