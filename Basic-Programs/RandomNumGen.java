import java.util.Scanner;

public class RandomNumGen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("Hola!");
        // System.out.println("Wanna Play Some game? ");
        // System.out.println("Let's see!");
        // System.out.println("");
        // System.out.println("You have to guess a SINGLE DIGIT number");
        // System.out.println("If you guess right you will win the game");
        // System.out.println("You have 4 chances to guess right number");
        System.out.println(" Hola! \n   \n Guess Single digit number  \n lets gooooo....");
    
        
        

        while(true){
            int guess = (int) (Math.random()*(9-0+1)+0);
              int n = scn.nextInt();

              if(n == guess){
                  System.out.println("Congratulations!!! PARTY");
                  break;
              }
              
              else{
                System.out.println(guess);
                  System.out.println("Oops! Better luck next time! ");
              }
        }
        
    
    // int a = scn.nextInt();
    //     System.out.println("");
    //     if(a == guess ){
    //         System.out.println("Congratulations! You won this game");
          
    //     }
     
    //     else System.out.println("Oops!!! Better luck next time");
    
    // int b = scn.nextInt();
    
    //     if(a == guess ){
    //         System.out.println("Congratulations! You won this game");
         
    //     }
    
    //     else System.out.println("Oops!!! Better luck next time");
    
    // int c = scn.nextInt();
    //     if(a == guess ){
    //         System.out.println("Congratulations! You won this game");
           
    //     }
    //     else System.out.println("Oops!!! Better luck next time");

    // int d = scn.nextInt();
        
    //     if(a == guess ){
    //         System.out.println("Congratulations! You won this game");
            
    //     }
    //     else System.out.println("Oops!!! Better luck next time");

        // scn.nextInt();\
        scn.close();
    }
}
