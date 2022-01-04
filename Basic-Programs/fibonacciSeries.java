import java.util.Scanner;
public class fibonacciSeries{
    public static void main(String[] args) {
        int n1= 0, n2 = 1 , n3;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        System.out.print(n1 + " " +n2);

        for(int i=2 ; i<=n ; ++i ){
            n3  = n1 +n2;
            System.out.print(" "+n3);

            n1 = n2;
            n2 = n3;
        }
     scn.close();

    }
}