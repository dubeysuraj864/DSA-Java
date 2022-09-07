import java.util.Scanner;

public class AllFibo {
    public static void main(String[] args) {

        // 0 1 1 2 3
        // a b fib

        Scanner scn = new Scanner(System.in);
         

        int n = scn.nextInt();
        int fib = 0;
        int a = 0;
        int b = 1;
        int i = 1;

        while (n >= i) {
            System.out.print(a + " ");
            fib = a + b;
            a = b;
            b = fib;
            

            i++;
        }
        scn.close();

    }
  

}
