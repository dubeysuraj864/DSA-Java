import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();
        int temp, digits=0, last=0, sum=0;
        temp=n ;

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
        if(n == sum ){
            System.out.println("Armstrong");
        }
        else System.out.println("Not armstrong");
        scn.close();
    }
}
