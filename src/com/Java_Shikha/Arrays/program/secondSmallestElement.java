package com.Java_Shikha.Arrays.program;

public class secondSmallestElement {
    public static void main(String[] args){
        int[] a={23,89,78,32,19,13,89};

        int s1=a[0];
        int s2=a[1];

        for(int i=0;i<a.length;i++){
            if(a[i]==s1) continue;

            if(a[i]<s1){
                s2=s1;
                s1=a[i];
            }
            else if(a[i]<s2 || s1==s2){
                s2=a[i];
            }
        }
        System.out.println("smallest number: " + s1);
        System.out.println("second Smallest number: "+ s2);
    }
}
