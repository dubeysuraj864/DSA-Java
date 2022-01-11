class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class dogs extends Animal{
    void eat(){
        System.out.println("eating pizza");
    }
}

class babydog extends dogs{
    void eat(){
        System.out.println("Drinking milk");
    }
}
public class polyMultilevelInh {
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1= new Animal();
        a1.eat();
        a2 = new dogs();
        a2.eat();
        a3 = new babydog();
        a3.eat();
    
    }
}
