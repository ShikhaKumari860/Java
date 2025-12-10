package com.Java_Shikha.Arrays.program;
import java.util.Arrays;

public class swapArrays {
    public static void main(String[] args){
        int[] a={40,20,10,50,90};

        int i=0;
        int j=a.length-1;

        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(a));
    }
}
