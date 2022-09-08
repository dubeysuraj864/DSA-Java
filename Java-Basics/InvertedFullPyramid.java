public class InvertedFullPyramid {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {

            for (int space = i; space <= n; space++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {

            for (int space = i; space <= n; space++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
