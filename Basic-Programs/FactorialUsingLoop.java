import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {

        int i,fact=1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

       for(i=1 ; i<= num ; i++){
           
            fact = fact * i;
        }
        System.out.println("Factorial of "+ num + " is: "+ fact);
    
        scn.close();
    }
}
