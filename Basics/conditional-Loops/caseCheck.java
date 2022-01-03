import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().trim().charAt(0);

        if(ch >= 'a' && ch<= 'z'){
            System.out.println("smaller");
        }
        else

        System.out.println("Capital");
    }
}  