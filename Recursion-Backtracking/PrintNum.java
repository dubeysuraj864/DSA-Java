import java.util.*;

public class PrintNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        pdi(n);
    }
    public static void pdi(int n){
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    
    
}
