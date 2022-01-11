//When type of the object is determined at run-time, it is known as dynamic binding

public class dynamicBinding {
    void eat(){
        System.out.println("she is eating pizza");
    }
}

class selena extends dynamicBinding{
    
    void eat(){
        System.out.println("selena is eating");
        
    }
    public static void main(String[] args) {
        dynamicBinding db = new selena();
        db.eat();
    }
}
