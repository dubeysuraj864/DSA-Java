import java.util.Scanner;

public class FactorialRecur {
    static int facto(int n){

        if(n==0){
            return 1;
        }
        else 
        return (n * facto(n-1));
                
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();

        System.out.print("Facto of "+ n + " is "+ facto(n));

        scn.close();
    }
}
