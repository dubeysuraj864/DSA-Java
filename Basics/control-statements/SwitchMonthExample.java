import java.util.Scanner;

public class SwitchMonthExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number! \n Make sure that which number you will enter should be equal to 12 or less and should not be equal to zero. ");
        int month = scn.nextInt();
        String monthString = "";

        switch(month){
            case 1: monthString = "1- January";
            break;

            case 2: monthString = "2- February";
            break;
            
            case 3: monthString = "3- March";
            break;

            case 4: monthString = "4- Arpil";
            break;

            case 5: monthString = "5- May";
            break;

            case 6: monthString = "6- June";
            break;

            case 7: monthString = "7- July";
            break;

            case 8: monthString = "8- August";
            break;

            case 9: monthString = "9- September";
            break;

            case 10: monthString = "10- October";
            break;

            case 11: monthString = "11- November";
            break;

            case 12: monthString = "12- December";
            break;

          default: System.out.println("Invalid Month!");


        }
                    System.out.println(monthString);

    }
}
