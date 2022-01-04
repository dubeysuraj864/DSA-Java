import java.util.Scanner;

// fibonacci series using recursion

public class fibonacciSeries2 {
    static int n1=0, n2=1,n3=0;
    static void printFibo(int count){
        if(count > 0){
            n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1);
        }

        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number");
        int count = scn.nextInt();
        System.out.print(n1 + " " + n2);
        printFibo(count-2);

        scn.close();
    }
    
}
