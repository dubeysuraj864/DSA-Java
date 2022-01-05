import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter a number to check wheather palindrome or not ");
        original = scn.nextLine();

        int length = original.length();
        for(int i= length-1 ; i>=0 ;i--){
            reverse = reverse + original.charAt(i);
            if(original.equals(reverse)){
                System.out.println("Palindome");
            }
            else{
                System.out.println("Not palindrome");
            }

        }
    }
}
