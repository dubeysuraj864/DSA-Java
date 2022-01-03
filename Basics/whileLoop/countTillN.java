import java.util.Scanner;

public class countTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
            int i=1;
        while(i <= number){
            System.out.println(i);
            i++;
        }
    }
}
