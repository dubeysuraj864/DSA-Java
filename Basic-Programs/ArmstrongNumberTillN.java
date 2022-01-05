import java.util.*;
import java.lang.Math;
public class ArmstrongNumberTillN{
      
    static boolean isArmstrong(int n){
        int temp, digits=0, last=0;
        int sum=0;
        temp =n ;

        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp =n;
        while(temp>0){
            last = temp%10;
            sum += (Math.pow(last, digits));
            temp = temp/10;
        }

        if(n==sum)   {
             return true;  
        }    
        else return false;   
        } 
    
    public static void main(String[] args) {
                int num;
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter a number");
                num = scn.nextInt();
                System.out.println("Armstrong Number up to "+ num + " are: ");

                for(int i=0 ; i<=num ; i++)
                
                if(isArmstrong(i))
                System.out.print(i+",");

                scn.close();
    }
}