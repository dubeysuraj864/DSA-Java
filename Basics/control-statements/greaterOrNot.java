import java.util.Scanner;

public class greaterOrNot {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        if(age == 20){
            System.out.println("age is equal to 20");
        }
        
        else if (age > 20){
            System.out.println(" age is greater than 20");
        }
        else{
            System.out.println("age is less than 20");
        }
        scn.close();
    }
}
