class Animals{
    Animals(){
        System.out.println("Animals is created.");
    }
}
class cow extends Animals{
    cow(){
        super();
        System.out.println("cow is created");
    }
}
public class super3 {
    public static void main(String[] args) {
        cow c = new cow();
    }
}
