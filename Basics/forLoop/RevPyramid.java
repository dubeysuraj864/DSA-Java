import java.util.Scanner;

public class RevPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number ");
        int number = scn.nextInt();

        for(int i=1 ; i<= number ; i++){
            for(int j=number ; j>=i ; j--){
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
    
}
