import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        int r, sum= 0, temp;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        temp =n;
        while(n > 0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        scn.close();
    }
}
