import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
     
        int a ,b;
        a = scan.nextInt();
        b = scan.nextInt();

        int sum = a+b;

        System.out.println(sum);

        boolean apple = true;
        boolean banana = false;

        byte byteVar = 0;

        short shortVar = 1;

        long longVar = 123434;

        float floatVar = 69.6f;

        double doubVar = 344.42223;

        char c = 's';
        
        System.out.println(apple + " " + banana + " " + byteVar + " " + shortVar + " " + longVar + " " + floatVar +" "+ doubVar + " " + c);


    }
}
