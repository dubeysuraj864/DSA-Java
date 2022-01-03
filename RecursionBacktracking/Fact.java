import java.util.*;

public class Fact{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else
        return(n* fact(n-1));
    } 
     public static void main(String[] args) {
         int factorial =1;
         Scanner scn = new Scanner (System.in);
         int number = scn.nextInt();

         factorial = fact(number);

         System.out.println("factorial of "+ number+ " is "+ factorial);
            
     }
    
}