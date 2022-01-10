public class exp {
    exp(){
        System.out.println("Parent class is invoked");
    }
}
class exp2 extends exp{
    exp2(){
        super();
        System.out.println("child class constructor invoked");
    }

   {
    System.out.println("instance initializer block is invoked");
   }
   public static void main(String[] args) {
       exp2 b = new exp2();
   }
}
