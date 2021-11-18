package com.company;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        int n;
        int temp;
        int i;
        int j;
         Scanner sc = new Scanner(System.in);
         n =sc.nextInt();
         int a[]= new int[n];
        System.out.println("Enter the nos");
        for (i=0; i<n ; i++){
            a[i]= sc.nextInt();
        }
        for(i=0 ; i<n; i++){
            for(j=i+1 ; j<n ; j++){
                if(a[i]>a[i]){
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending order");
        for(i=0; i<n ;i++){
            System.out.println(a[i]);
        }

    }
}
