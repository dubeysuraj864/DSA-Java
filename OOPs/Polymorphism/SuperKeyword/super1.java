class animal5{
    String color="white";
}
class dogg extends animal5{
    String color= "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class super1 {
    public static void main(String[] args) {
        dogg d = new dogg();
        d.printColor();
    }
}
