public class Prime {
    public static void main(String[] args) {
        int n = 21;

        for (int i = 2; i <= n; ++i) {
            if (n % i == 0 && i == n) {
                System.out.println(n + " is a Prime Number");
            } else if (n % i == 0 && i != n) {
                System.out.println(n + " is not a Prime Number");
                break;
            }
        }
    }
}