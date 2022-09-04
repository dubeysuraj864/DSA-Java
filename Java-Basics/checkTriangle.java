import java.util.*;;

public class checkTriangle {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a==b && b == c && c == a){
            System.out.println("Triangle is equilateral");
        }
        else if ( a==b || a==c || b==c){
            System.out.println("Triangle is Isosceles");
        }
        else if( a != b && b !=c  && c != a){
            System.out.println("Triangle is Scalene10");
        }
        
    }
}
