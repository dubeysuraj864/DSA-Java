import java.util.Scanner;

public class largest2 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
    
}
