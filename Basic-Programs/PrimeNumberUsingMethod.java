import java.util.Scanner;

public class PrimeNumberUsingMethod {
    static void checkPrime(int n){
        int  m=0,i, flag =0; 
        m=n/2;
        if(n == 0 || n==1){
            System.out.print(n + " is not a prime number");
        }
        else{
            for( i=2 ;i<=m; i++ ){
                if(n%i ==0){
                    System.out.print(n + " is not a prime number");
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n + " is a prime number");
            }
        }
    
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        checkPrime(n);
        
        scn.close();
    }
    
}
