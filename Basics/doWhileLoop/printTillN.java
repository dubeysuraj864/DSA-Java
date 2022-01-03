import java.util.Scanner;

public class printTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();

        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
