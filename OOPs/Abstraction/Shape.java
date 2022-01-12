abstract class Shape {
    abstract void draw();
}
class rectangle extends Shape{
    void draw(){
        System.out.println("Dwaring rectangle");
    }
} 
class circle extends rectangle{
    void draw(){
        System.out.println("drawing circle");
    }
}

class testAbstract{
    public static void main(String[] args) {
        Shape s = new circle();
        s.draw();
    }
}