import java.util.Scanner;
import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if(b > max){
            max = b;

        }
        if (c > max){
            max = c;
        }
        else{
            System.out.println(max);
        }
        scn.close();
    }

    
}
