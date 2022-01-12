interface printable{
    void print();
}
interface showable extends Printable{
    void show();
}
class InterfaceInheritance {
    public void print(){
        System.out.println("hello");
    }    
    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        InterfaceInheritance ifi = new InterfaceInheritance();
        ifi.print();
        ifi.show();
    }
}

