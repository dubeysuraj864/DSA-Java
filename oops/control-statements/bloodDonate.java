import java.util.Scanner;

public class bloodDonate {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Hola!");
        System.out.println("What's your age? \n");
        int age = scn.nextInt();
       

        if(age == 18 || age > 18){
            System.out.println("And how much is your weight?? :-P");
            int weight = scn.nextInt();
            if(weight > 50){
            System.out.println("Awesome ! You are eligible to donate blood");
            }
            else{
                System.out.println("Go home you slim-sheddy XDDD, Increase your weight and eat some healthy shit!  ");
            }

        }
        else{
            System.out.println("Holy shit! You're Child, Myboi");
        }
    }
}
