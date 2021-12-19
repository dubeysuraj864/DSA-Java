import java.util.Scanner;

import java.util.*;
public class decreaseArray {
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
     int [] arr = new int[n];

    for(int i=0 ; i<n ; i++){
        arr[i] = scn.nextInt();
    }

    System.out.print(printDecreasing(n));
}
    public static int printDecreasing(int n){
        if(n==0 ){
            return 1;
        }
    
        System.out.println(n);
        printDecreasing(n-1);
    }
}
