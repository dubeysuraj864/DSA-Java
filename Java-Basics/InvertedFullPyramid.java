public class InvertedFullPyramid {
    public static void main(String[] args) {
        int n = 10;

        for (int i = n; i >= 1; i--) {

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
