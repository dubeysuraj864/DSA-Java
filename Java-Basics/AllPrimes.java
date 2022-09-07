import java.util.*;

public class AllPrimes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int i = 2;

        while (n >= i) {

            for (int a = 2; a <= i; a++) {
                if (i % a == 0 && a != i) {
                    break;
                } else if (i % a == 0 && a == i) {
                    System.out.print(a + " ");

                }

            }

            i++;

        }
        scn.close();
        // }
    }
}
