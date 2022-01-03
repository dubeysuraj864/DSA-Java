import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(DigitOfSum(125));
    }
    static int DigitOfSum(int n){
        if(n == 1){
            return 1;

        }
        else{
            return (n%10 + DigitOfSum(n/10));
        }
    }
}
