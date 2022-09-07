public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {

        int n = 20;

        for (int i = n; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {

                if (i == n) {
                    System.out.print("*");
                }

                else if (j == 1 || j == i) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }
    }
}