public class Palindrome1 {
    public static void main(String[] args) {
       int n= 12321;
        
        int temp = rev(n, 0);

        if(temp == n){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }

    }
    public static int  rev(int n, int temp){
        if(n==0 ){
            return temp;
        }
        temp = (temp*10)+(n%10);
        return rev(n/10, temp);
    }
}
