package com.company;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int r;
        int c;
        int n;
        int temp;
        int i;
        int j;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total rows and columns");
        r= scn.nextInt();
        c= scn.nextInt();
        int a[][]= new int [r][c];
        System.out.println("enter matrix");
        for(int i=0; i<r ; i++){
            for(j=0; j<c ; j++){
                a[i][j]= scn.nextInt();
            }
        }
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ;j++ ){

            }

        }


    }
}
