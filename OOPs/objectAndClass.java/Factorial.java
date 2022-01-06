import java.util.Scanner;

public class Factorial {

    void fact(int n){
        int fact=1;
        for(int i=1; i<=n ; i++){
            fact=fact*i;
        }

        System.out.println("fact is : "+ fact);
    }
        
        public static void main(String[] args) {
            new Factorial().fact(5);
        }
}


