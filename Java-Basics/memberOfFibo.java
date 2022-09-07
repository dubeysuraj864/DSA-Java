import java.util.Scanner;

public class memberOfFibo{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        int i=1;
        int a= 0;
        int b=1;
        int fib= 0;

        while(n >= i){
            // System.out.print(a + " ");

            fib = a+b;
            a=b;
            b=fib;

            if(n==a){
                System.out.println("yes");
                break;
            }
            else if(n!=a && i ==n){
                System.out.println("no");
            }

            i++;
        }

    }
}