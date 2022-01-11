public class bike8 {
    int speed;

    bike8(){
        System.out.println("Constructor is invoked");
    }

    {System.out.println("instance initializer block invoked");}

    public static void main(String args[]) {
        bike8 b1 = new bike8();
        bike8 b2 = new bike8();
    }
}
