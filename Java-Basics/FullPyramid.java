public class FullPyramid{
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++ ){

            for(int space=n ; space>=i ; space--){
                System.out.print(" ");
            }

            for(int j=1; j<=i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}