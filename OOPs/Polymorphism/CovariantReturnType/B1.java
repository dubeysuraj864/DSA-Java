public class B1 {
    B1 get(){
        return this;
    }
}
class A9 extends B1{
    @Override
    A9 get(){
        return this;
    }

    void message(){
        System.out.println("Welcome to  convariant return type");
    }


   public static void main(String[] args) {
       new A9().get().message();

   } 
}
