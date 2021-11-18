package temp;

i23mport java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        int r, sum=0, temp;
        int x= scn.nextInt();
        temp =x;
        while(x >0){
            r = x % 10;
            sum = (sum * 10) + r;
            x = x/10;
        }

        if(temp == sum){
            System.out.println(temp + " is a palindrome");
        }
        else{
            System.out.println(temp + " is not a palindrome");
        }
        scn.close();
    }
}