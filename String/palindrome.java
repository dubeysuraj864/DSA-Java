import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class palindrome {
    public static void main(String[] args) {
        int sum = 0,temp,r;
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        temp = n;

        while(n > 0){
             r = n % 10;
             sum = (sum * 10)+ r;
             n = n/10;

        }
        if(temp == sum){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    
}
