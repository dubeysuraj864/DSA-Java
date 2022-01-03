import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int number = scn.nextInt();
        
        
            switch(number){
                case 10:
                System.out.println("10");
                break;

                case 20:
                System.out.println("20");
                break;

                default: System.out.println("Not in 10 and 20");
               
            
        }
    }
}
