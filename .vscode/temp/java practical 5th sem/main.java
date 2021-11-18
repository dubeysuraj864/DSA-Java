import java.util.*;

class CheckPalimdrome{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in );
        int r, sum =0, temp;

        System.out.println("enter the number to check palindrome or not: ");
        int n = scn.nextInt();
        temp =n ;
        while(n > 0){
            r = n %10;
            sum = (sum * 10)+r;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println(temp + " is a palindrome.");
        }
        else{
            System.out.println(temp + " is not a palindrome");
        }
        scn.close();
    }
}