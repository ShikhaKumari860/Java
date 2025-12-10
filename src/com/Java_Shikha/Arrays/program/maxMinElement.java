package com.Java_Shikha.Arrays.program;
import java.util.Arrays;

public class maxMinElement {
    public static void main(String[] args){
        int[] a={89,32,92,43,67,94,50};

        int max=a[0];
        int min=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];

            if(a[i]<min)
                min=a[i];

        }
        System.out.println(min);
        System.out.println(max);
    }
}
