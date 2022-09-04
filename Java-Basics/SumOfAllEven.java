import java.util.*;
public class SumOfAllEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int sum = 0;

        for(int i = 1 ; i<=N ; i++){
            if(i%2==0){
                sum += i;

        System.out.println(i + "-> " +sum);
            }
          
        }

    }
}
