import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("enter a number ");
        int number = scn.nextInt();

        for(int i=1 ; i<= 10 ; i++){
          System.out.println(number + " * " + i + " = "+  number * i);
        }
    }
    
}
