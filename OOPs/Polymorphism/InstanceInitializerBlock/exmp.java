public class exmp {
    exmp(){
        System.out.println("parent class constructor invoked");
    }
}
class exmp2 extends exmp{
    exmp2(){
        super();
        System.out.println("child class constructor invoked");
    }

    exmp2(int a){
        super();
        System.out.println("child class contructor invoked "+ a);
    }
    {System.out.println("Instance initializer block is invoked");}


    public static void main(String[] args) {
        exmp2 e1 = new exmp2();
        exmp2 e2 = new exmp2(10);
    }
}
