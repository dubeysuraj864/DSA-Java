  class Shape {
    void draw(){
        System.out.println("Drawing");
    }
}
class rectangle extends Shape{
     void draw(){
         System.out.println("Drawing rectangle");
     }
}
class circle extends rectangle{
    void draw(){
        System.out.println("Dwaring circle");
    }
}
class triangle extends circle{
    void draw(){
        System.out.println("Drawing triangle");
    }

}

class testPoly{
    public static void main(String[] args) {
        Shape s;
        s= new rectangle();
        s.draw();
        s= new circle();
        s.draw();
        s = new triangle();
        s.draw();
        
    }
}



