import java.util.*;
import java.math.*;

public class GCD {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int gcd = 0;

        for(int i=1 ; i<= a && i<= b; i++){
         if(a%i==0 && b%i==0 ){
            gcd = i;
         }
        }
        System.out.println(gcd);
     

    }

}
