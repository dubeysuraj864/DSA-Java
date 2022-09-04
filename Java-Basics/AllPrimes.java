import java.util.*;

public class AllPrimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int primes = 0;

        for (int i = 2; i <= N; i++) {
            if (i % 2 != 0) {

                for (int j = 1; j <= i; j++) {
                    if (i == j) {
                        primes = i;
                        System.out.println(primes);
                    }
                }

            }
        }

    }
}
