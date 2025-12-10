package com.Java_Shikha.Arrays.program;

public class secondHighestNumber {
    public static void main(String[] args){
        int[] a={2,4,0,9,1,3,5};

        int max=a[0];
        int secMax=a[1];
        for(int i=0;i<a.length;i++){
            if(a[i]==max) continue;

            if(a[i]>max){
                secMax=max;
                max=a[i];
            }else if(a[i] >secMax || max==secMax){
                secMax=a[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
