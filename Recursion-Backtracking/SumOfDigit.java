import java.util.*;

public class SumOfDigit {
   public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
       int n = scn.nextInt();

       System.out.println(sum(n));

   }
   
   public static int sum(int n){
       if(n ==0){
           return 1;
       }
       else{
           return (n%10+sum(n/10));
       }
   }
   
}

